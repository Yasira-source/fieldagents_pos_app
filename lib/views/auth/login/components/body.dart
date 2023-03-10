import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'sign_form.dart';

class Body extends StatelessWidget {
   const Body({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: SizedBox(
        width: double.infinity,
        child: Padding(
          padding:
              const EdgeInsets.symmetric(horizontal: 20),
          child: Column(
            children: [
              SizedBox(height: MediaQuery.of(context).size.height * 0.04),
              const Text(
                "Welcome Back",
                style: TextStyle(
                  color: Color(0xFF02182e),
                  fontSize: 28,
                  fontWeight: FontWeight.bold,
                ),
              ),
              const Text(
                "Sign in with your email and password",
                textAlign: TextAlign.center,
              ),
              SizedBox(height: MediaQuery.of(context).size.height * 0.08),
              const SignForm(),
              SizedBox(height: MediaQuery.of(context).size.height * 0.02),

              // ignore: prefer_const_constructors
              // NoAccountText(),
              SizedBox(height: 20),
              // Row(
              //   mainAxisAlignment: MainAxisAlignment.center,
              //   children: [
              //     SocalCard(
              //       icon: "assets/icons/google-icon.svg",
              //       press: () {},
              //     ),
              //     SocalCard(
              //       icon: "assets/icons/facebook-2.svg",
              //       press: () {},
              //     ),
              //     SocalCard(
              //       icon: "assets/icons/twitter.svg",
              //       press: () {},
              //     ),
              //   ],
              // ),

            ],
          ),
        ),
      ),
    );
  }
}
