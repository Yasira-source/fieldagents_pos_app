import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import 'package:plussaveagent/views/home/utilities/themeStyles.dart';

import 'package:http/http.dart' as http;
import '../../../models/transactions_model.dart';
import '../../../theme.dart';

class RecentTransactions extends StatefulWidget {
  String uid;
  RecentTransactions(this.uid);
  @override
  _RecentTransactionsState createState() => _RecentTransactionsState();
}

class _RecentTransactionsState extends State<RecentTransactions> {
  var f = NumberFormat("###,###", "en_US");
  // String uid = '';

  Future<List<TransactionsData>> fetchRelated(String tag) async {
    final response = await http.get(Uri.parse(
        'http://admin.plussavefinancial.com/api/api/employee/get_latest_app_transactions.php?id=$tag'));
    // if (response.statusCode == 200) {
    List jsonResponse = json.decode(response.body);
    // print(tag);
    // print(jsonResponse);
    return jsonResponse.map((data) => TransactionsData.fromJson(data)).toList();
    // } else {
    //   throw Exception('Unexpected error occured!');
    // }
  }

  @override
  Widget build(BuildContext context) {
    Widget transactionItem({TransactionsData data}) {
      String title;
      String amount;
      String icon;
      String ddate;
      String status;
      String acno;
      String wallet;
      bool ch = true;
      ddate = data.accountName;
      acno = data.accountNo;
      if (data.type == "D" || data.type == "R") {
        icon = 'assets/17.gif';
        amount = '+${f.format(int.parse(data.amount))}';
        ch = false;
        status = data.status == '1' ? 'Successful' : 'Pending';
        wallet = data.wallet == 'S' ? 'Savings Wallet' : 'Loans Wallet';
        if (data.type == "D") {
          title = 'Deposit ($wallet)';
        } else {
          title = 'Membership Fees ($status)';
        }
      } else {
        icon = 'assets/17.gif';
        amount = '+${f.format(int.parse(data.amount))}';
        status = data.status == '1' ? 'Successful' : 'Pending';
 wallet = data.wallet == 'S' ? 'Savings Wallet' : 'Loans Wallet';
        title = '${data.reason} ($wallet)';
      }

      return Container(
        padding: const EdgeInsets.all(1),
        margin: const EdgeInsets.only(
          bottom: 8,
        ),
        decoration: BoxDecoration(
          color: whiteColor,
          borderRadius: BorderRadius.circular(18),
        ),
        child: ListTile(
          contentPadding: EdgeInsets.zero,
          leading: Image.asset(icon),
          title: Text(
            title,
            style: blackTextStyle.copyWith(
              fontSize: 16,
              fontWeight: medium,
            ),
          ),
          subtitle: Text(
            (ddate + ' ' + acno),
            style: greyTextStyle.copyWith(
              fontSize: 12,
            ),
          ),
          trailing: Text(
            amount,
            style: ch
                ? redTextStyle.copyWith(
                    fontSize: 16,
                  )
                : redTextStyle.copyWith(
                    fontSize: 16,
                  ),
          ),
        ),
      );
    }

    return Expanded(
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.only(
              left: 15.0,
              right: 15.0,
              bottom: 16.0,
              top: 32.0,
            ),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text('Recent Transactions', style: ThemeStyles.primaryTitle),
                Text('See All', style: ThemeStyles.seeAll),
              ],
            ),
          ),
          Flexible(
              flex: 1,
              child: FutureBuilder<List<TransactionsData>>(
                  future: fetchRelated(widget.uid),
                  builder: (context, snapshot) {
                    print(snapshot.error);
                    if (snapshot.hasData) {
                      List<TransactionsData> data = snapshot.data;
                      return ListView.builder(
                        itemCount: data.length,
                        itemBuilder: (context, position) {
                          return transactionItem(data: data[position]);
                        },
                      );
                    } else {
                      return const Center(
                        child: CircularProgressIndicator(),
                      );
                    }
                  }))
        ],
      ),
    );
  }
}
