import 'package:flutter/material.dart';
import 'package:get/get.dart';

import 'auth/login/sign_in_screen.dart';

class WelcomeScreen extends StatelessWidget {
  const WelcomeScreen({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final size = MediaQuery.of(context).size;
    return Scaffold(
      backgroundColor: Colors.white,
      body: Column(
        children: [
          SizedBox(
            height: size.height / 10,
          ),
          Container(
            height: size.height / 3,
            width: size.width,
            decoration: const BoxDecoration(
              image: DecorationImage(
                  image: AssetImage("assets/images/logo.png"),
                  fit: BoxFit.fitHeight),
            ),
          ),
          SizedBox(
            height: size.height / 20,
          ),
          Center(
            child: Text(
              "Welcome Back!",
              style: TextStyle(
                  fontSize: size.width / 14, fontWeight: FontWeight.w500,color: const Color(0xFF02182e)),
            ),
          ),
          SizedBox(
            height: 5,
          ),
          // Center(
          //   child: Image.asset('assets/logo.png'),
          // ),
          Padding(
            padding: const EdgeInsets.all(12.0),
            child: Center(
              child: Text("Plus Save Agent's App - a new way to ",
                  style: TextStyle(
                      fontSize: size.width / 20, fontWeight: FontWeight.w500,color: const Color(0xFF02182e))),
            ),
          ),
          Center(
            child: Text(
              "Connect with Our Clients.",
              style: TextStyle(
                  fontSize: size.width / 20, fontWeight: FontWeight.w500,color: const Color(0xFF02182e)),
            ),
          ),
          SizedBox(
            height: size.height / 20,
          ),
          customButton(size, const Color(0xff047434), "Login", () {
            Get.to(()=>const SignInScreen());
          }),
          // customButton(size, const Color(0xFFc82128), "Become a Member",
          //     () {
          //   Get.to(()=> MembershipCategoryPage());
          // }),
          
          
        ],
      ),
    );
  }

  Widget customButton(Size size, Color color, String text, VoidCallback onTap) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 10),
      child: GestureDetector(
        onTap: onTap,
        child: Material(
          color: color,
          elevation: 8,
          borderRadius: BorderRadius.circular(10),
          child: Container(
            height: size.height / 12,
            width: size.width / 1.7,
            alignment: Alignment.center,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(20),
            ),
            child: Text(
              text,
              style: TextStyle(
                  color: Colors.white,
                  fontSize: size.width / 22,
                  fontWeight: FontWeight.w500),
            ),
          ),
        ),
      ),
    );
  }
}
