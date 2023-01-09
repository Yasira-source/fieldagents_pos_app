import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:plussaveagent/views/home/screens/home.dart';
import 'package:plussaveagent/views/home/screens/services_page.dart';

class HomeWidget extends StatefulWidget {
  String uid;
  HomeWidget(this.uid);
  @override
  _HomeWidgetState createState() => _HomeWidgetState();
}

// Used for Bottom Navigation Bar

class _HomeWidgetState extends State<HomeWidget> {
  int selectedIndex = 0;
  @override
  Widget build(BuildContext context) {
    List<Widget> widgetOptions = <Widget>[
      HomeScreen(widget.uid),
      ServiceScreen(),
      HomeScreen(widget.uid),
      HomeScreen(widget.uid),
    ];
    void onTabTapped(index) {
      setState(() {
        selectedIndex = index;
      });
    }

    return Scaffold(
      body: widgetOptions.elementAt(selectedIndex),
      bottomNavigationBar: NavigationBarTheme(
        data: NavigationBarThemeData(
          indicatorColor: const Color(0xff047434),
          labelTextStyle: MaterialStateProperty.all(
            const TextStyle(
              fontSize: 14,
              fontWeight: FontWeight.w500,
            ),
          ),
        ),
        child: NavigationBar(
            height: 60,
            backgroundColor: Colors.white,
            selectedIndex: selectedIndex,
            animationDuration: const Duration(seconds: 3),
            onDestinationSelected: (index) =>
                setState(() => this.selectedIndex = index),
            destinations: const [
              NavigationDestination(
                icon: Icon(Icons.home_outlined),
                selectedIcon: Icon(
                  Icons.home,
                  color: Colors.white,
                ),
                label: 'Home',
              ),
              NavigationDestination(
                icon: Icon(Icons.design_services_rounded),
                selectedIcon: Icon(
                  Icons.design_services_rounded,
                  color: Colors.white,
                ),
                label: 'Services',
              ),
              NavigationDestination(
                icon: Icon(Icons.help),
                selectedIcon: Icon(
                  Icons.help,
                  color: Colors.white,
                ),
                label: 'Account',
              ),
              NavigationDestination(
                icon: Icon(Icons.tips_and_updates_outlined),
                selectedIcon: Icon(
                  Icons.tips_and_updates,
                  color: Colors.white,
                ),
                label: 'Transactions',
              ),
            ]),
      ),
    );
  }
}
