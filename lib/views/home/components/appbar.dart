import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:shared_preferences/shared_preferences.dart';

class Appbar extends StatefulWidget {
  @override
  _AppbarState createState() => _AppbarState();
}

class _AppbarState extends State<Appbar> {

   String _pname = '';
  String uid = '';
   @override
  void initState() {
    super.initState();
    _loadCounter();
  }

  _loadCounter() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    setState(() {
      uid = (prefs.getString('uid') ?? '');
      _pname = (prefs.getString('username') ?? '');
    
    });
  }
  @override
  Widget build(BuildContext context) {
     String greet = greeting();
    return Padding(
      padding: const EdgeInsets.only(top: 20.0, left: 15.0, right: 8.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Text(
                    "$greet $_pname!",
                    style: const TextStyle(
                        color: Color(0xFF02182e),
                        fontSize: 20,
                        fontFamily: 'Lato',
                        fontWeight: FontWeight.bold),
                  ),
                  // const SizedBox(height: 10),
          // Row(
          //   children: [
          //     IconButton(
          //       icon: SvgPicture.asset('assets/analytics-icon.svg'),
          //       onPressed: null,
          //     ),
          //     IconButton(
          //       icon: SvgPicture.asset('assets/search-icon.svg'),
          //       onPressed: null,
          //     ),
          //     IconButton(
          //       icon: SvgPicture.asset('assets/more-icon.svg'),
          //       onPressed: null,
          //     )
          //   ],
          // )
        ],
      ),
    );
  }

    String greeting() {
    var hour = DateTime.now().hour;
    if (hour < 12) {
      return 'Good Morning,';
    }
    if (hour < 17) {
      return 'Good Afternoon,';
    }
    return 'Good Evening,';
  }
}
