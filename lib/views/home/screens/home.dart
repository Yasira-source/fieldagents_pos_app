import 'package:flutter/material.dart';
import 'package:plussaveagent/views/home/widgets/creditCard.dart';

import '../components/appbar.dart';
import '../components/recentTransactions.dart';

class HomeScreen extends StatefulWidget {
  HomeScreen(this.uid);
  String uid;
  @override
  _HomeScreenState createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Container(
        child: Column(
          children: [
            Appbar(),
            CreditCard(),
            RecentTransactions(widget.uid),
          ],
        ),
      ),
    );
  }
}
