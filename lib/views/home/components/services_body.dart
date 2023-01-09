import 'dart:convert';


import 'package:plussaveagent/views/auth/login/sign_in_screen.dart';
import 'package:plussaveagent/views/home/components/services_menu.dart';
import 'package:plussaveagent/views/home/screens/deposit_form.dart';
import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'package:http/http.dart' as http;

import 'package:get/get.dart';

import '../webview_of_sign_up.dart';

class Body extends StatefulWidget {
  Body({Key key,  this.uid}) : super(key: key);
  String uid;
  @override
  State<Body> createState() => _BodyState();
}

class _BodyState extends State<Body> {

  _loadCounterx() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    setState(() {
      widget.uid = (prefs.getString('uid') ?? '');
    
    });
  }

  @override
  void initState() {
    _loadCounterx();
  }

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      padding: const EdgeInsets.symmetric(vertical: 20),
      child: Column(
        children: [
      
          const SizedBox(height: 20),
          ServiceMenu(
            text: "Deposit Money",
            icon: "assets/icons/Bell.svg",
            press: () {
                    Navigator.of(context).push(MaterialPageRoute(
              builder: (BuildContext context) => DepositForm(dropdownvalue: 'Saving/Loan Repayment',uid: widget.uid,
              )
            ));
            },
          ),
         
          ServiceMenu(
            text: "Pay Membership",
            icon: "assets/icons/Bell.svg",
            press: () {
                      Navigator.of(context).push(MaterialPageRoute(
              builder: (BuildContext context) => DepositForm(dropdownvalue: 'Membership',uid: widget.uid,
              )
            ));
            },
          ),
          ServiceMenu(
            text: "Register New Member",
            icon: "assets/icons/User Icon.svg",
            press: () {
                       Navigator.of(context).push(MaterialPageRoute(
              builder: (BuildContext context) => MyWebView(
                title: "Registration Form ",
                selectedUrl: "http://admin.plussavefinancial.com/add_member_app.php?id="+widget.uid,
              )
            ));
            },
          ),
           ServiceMenu(
            text: "Create Loan Application",
            icon: "assets/icons/Settings.svg",
            press: () {
                       Navigator.of(context).push(MaterialPageRoute(
              builder: (BuildContext context) => MyWebView(
                title: "Loan Application Form ",
                selectedUrl: "http://admin.plussavefinancial.com/add_loan_app.php?id="+widget.uid,
              )
            ));
            },
          ),
          ServiceMenu(
            text: "Check Members' Details",
            icon: "assets/icons/Question mark.svg",
            press: () {
                        Navigator.of(context).push(MaterialPageRoute(
              builder: (BuildContext context) => MyWebView(
                title: "Members' Details ",
                selectedUrl: "http://admin.plussavefinancial.com/clients_select_app.php",
              )
            ));
            },
          ),
          ServiceMenu(
            text: "Log Out",
            icon: "assets/icons/Log out.svg",
            press: () async {
              SharedPreferences preferences =
                  await SharedPreferences.getInstance();
              await preferences.clear();
              Get.off(() => const SignInScreen());
            },
          ),
        ],
      ),
    );
  }
}
