import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import 'package:plussaveagent/views/home/screens/print_page.dart';

import '../../../utils/constants.dart';

class DataPage extends StatelessWidget {
  String _did;
  String _account_no;
  String account_name;
  String _authorisedby;
  String _paidby_name;
  String _paidby_phone;
  String _amount;
  String _reason;
  String _status;
  String branch_name;
  String acc_balance;
  String pending;
  String _date_created;
  String wallet;
  DataPage(
      this._did,
      this._account_no,
      this.account_name,
      this._authorisedby,
      this._paidby_name,
      this._paidby_phone,
      this._amount,
      this._reason,
      this._status,
      this.branch_name,
      this.acc_balance,
      this.pending,
      this._date_created,this.wallet);
  final List<Map<String, dynamic>> data = [
    {'title': 'Transaction Amount', 'price': 50000, 'qty': 100},
  
  ];

  final f = NumberFormat("UGX ###,###.00", "en_US");

  @override
  Widget build(BuildContext context) {
    int _total = 0;
    // _total = data.map((e) => e['price'] * e['qty']).reduce(
    //       (value, element) => value + element,
    //     );
    return Scaffold(
      appBar: AppBar(
        title: Text("Deposit Details"),
        backgroundColor: kPrimaryColor,
      ),
      body: Column(
        children: [
          Expanded(
              child: ListView.builder(
            itemCount: data.length,
            itemBuilder: (c, i) {
              return ListTile(
                title: Text(
                  data[i]['title'].toString(),
                  style: TextStyle(
                    fontSize: 16,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                subtitle:
                    Text("UGX ${this._amount}"),
                trailing: Text(
                  "${this._did}",
                ),
              );
            },
          )),
          Container(
            color: Colors.grey[200],
            padding: EdgeInsets.all(20),
            child: Row(
              children: [
                Text(
                  "",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                  ),
                ),
                SizedBox(
                  width: 80,
                ),
                Expanded(
                    child: TextButton.icon(
                  onPressed: () {
                    Navigator.push(context,
                        MaterialPageRoute(builder: (_) => PrintPage( this._did,
      this._account_no,
      this.account_name,
      this._authorisedby,
      this._paidby_name,
      this._paidby_phone,
      this._amount,
      this._reason,
      this._status,
      this.branch_name,
      this.acc_balance,
      this.pending,
      this._date_created,this.wallet)));
                  },
                  icon: Icon(Icons.print),
                  label: Text("Print"),
                  style: TextButton.styleFrom(
                    primary: Colors.white,
                    backgroundColor: Colors.green,
                  ),
                )),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
