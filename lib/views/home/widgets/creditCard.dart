import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:intl/intl.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../../../theme.dart';
import '../utilities/themeColors.dart';
import '../utilities/themeStyles.dart';

class CreditCard extends StatefulWidget {
  @override
  _CreditCardState createState() => _CreditCardState();
}

class _CreditCardState extends State<CreditCard> {
  String _pname = '';
  String _pname1 = '';
  String _pname2 = '';
  String uid = '';
  String deposists = '';
  String membership = '';
  String loans = '';
  String branch = '';
  String email = '';
  String role = '';

  @override
  void initState() {
    super.initState();
    _loadCounter();
  }

  _loadCounter() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    setState(() {
      uid = (prefs.getString('uid') ?? '');
      _pname1 = (prefs.getString('fname') ?? '');
      _pname2 = (prefs.getString('lname') ?? '');
      _pname = _pname1 + ' ' + _pname2;
      deposists = (prefs.getString('deposits') ?? '');
      membership = (prefs.getString('membership') ?? '');
      loans = (prefs.getString('loans') ?? '');
      branch = (prefs.getString('branch') ?? '');
      email = (prefs.getString('email') ?? '');
      role = (prefs.getString('role') ?? '');
    });
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.only(top: 30),
      child: SingleChildScrollView(
        scrollDirection: Axis.horizontal,
        child: Row(
          children: [
            SizedBox(width: defaultMargin),
            _buildCreditCard(context,
                color: const Color(0xFF02182e),
                cardExpiration: "05/2024",
                balance: deposists,
                acc: (int.parse(deposists) + int.parse(membership)).toString(),
                status: loans,
                cardHolder: membership,
                cardNumber: _pname+ ' - ' + role),

            // SizedBox(width: 20),
            // Image.asset(
            //   'assets/image_card.png',
            //   height: 210,
            // ),
            SizedBox(
              width: defaultMargin,
            ),
          ],
        ),
      ),
    );
  }
}

// Build the top row containing logos
Row _buildLogosBlock() {
  return Row(
    mainAxisAlignment: MainAxisAlignment.spaceBetween,
    children: <Widget>[
      Image.asset(
        "assets/contact_less.png",
        height: 20,
        width: 18,
      ),
      Image.asset(
        "assets/mastercard.png",
        height: 50,
        width: 50,
      ),
    ],
  );
}

// Build the credit card widget
Card _buildCreditCard(BuildContext context,
    { Color color,
     String balance,
     String acc,
     String status,
     String cardNumber,
     String cardHolder,
     String cardExpiration}) {
  var f = NumberFormat("###,###", "en_US");
  return Card(
    elevation: 4.0,
    color: color,
    shape: RoundedRectangleBorder(
      borderRadius: BorderRadius.circular(14),
    ),
    child: Container(
      height: 200,
      width: MediaQuery.of(context).size.width * 0.9,
      padding: const EdgeInsets.only(left: 16.0, right: 16.0, bottom: 22.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: <Widget>[
          // _buildLogosBlock(),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: <Widget>[
              Padding(
                padding: const EdgeInsets.only(top: 5.0),
                child: Text(
                  '$cardNumber',
                  maxLines: 1,
                  style: const TextStyle(
                  
                      color: Colors.white,
                      fontSize: 12,
                      fontFamily: 'CourrierPrime'),
                ),
              ),
              Padding(
                padding: const EdgeInsets.only(top: 16.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: <Widget>[
                    const Text(
                      'LOAN APPLNS',
                      style: TextStyle(
                          color: Colors.grey,
                          fontSize: 9,
                          fontWeight: FontWeight.bold),
                    ),
                    Text(
                      status,
                      maxLines: 1,
                      overflow: TextOverflow.ellipsis,
                      style: const TextStyle(
                          color: Color(0xFF02a54d),
                          fontSize: 15,
                          fontWeight: FontWeight.bold),
                    )
                  ],
                ),
              )
            ],
          ),

         
          _buildDetailsBlock(
            label: 'TOTAL DEPOSITS',
            value: 'UGX ${f.format(int.parse(balance))}',
          ),

          _buildDetailsBlock(
            label: 'TOTAL MEMBERSHIP',
            value: 'UGX ${f.format(int.parse(cardHolder))}',
          ),
           _buildDetailsBlock(
            label: 'TOTAL CASH EXPECTED',
            value: 'UGX ${f.format(int.parse(acc))}',
          ),
        ],
      ),
    ),
  );
}

// Build Column containing the cardholder and expiration information
Column _buildDetailsBlock({ String label,  String value}) {
  return Column(
    crossAxisAlignment: CrossAxisAlignment.start,
    children: <Widget>[
      Text(
        '$label',
        style: const TextStyle(
            color: Colors.grey, fontSize: 11, fontWeight: FontWeight.bold),
      ),
      Text(
        '$value',
        maxLines: 1,
        overflow: TextOverflow.ellipsis,
        style: const TextStyle(
            color: Colors.white, fontSize: 15, fontWeight: FontWeight.bold),
      )
    ],
  );
}
