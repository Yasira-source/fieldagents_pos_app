
import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../components/services_body.dart';
import 'package:get/get.dart';

class ServiceScreen extends StatefulWidget {
  ServiceScreen({Key key}) : super(key: key);
  @override
  State<ServiceScreen> createState() => _ServiceScreenState();
}

class _ServiceScreenState extends State<ServiceScreen> {
  static String routeName = "/profile";
  String _pname = '';
  String upname = '';
  String uid = '';
  String email = '';
  String pic = '';
  
  @override
  void initState() {
    super.initState();
    _loadCounterx();
  }

  _loadCounterx() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    setState(() {
      uid = (prefs.getString('uid') ?? '');
       pic = (prefs.getString('pic') ?? '');
      _pname = (prefs.getString('username') ?? '');
      email = (prefs.getString('email') ?? '');
      final x = _pname.split(" ");
      upname = x[0];
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFFeff5f3),
      appBar: AppBar(
        backgroundColor: const Color(0xff047434),
    title: Text('Agency Banking Services'),  ),
      body: SingleChildScrollView(child: Body(uid: uid,)),
    );
  }
}
