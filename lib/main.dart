import 'package:animated_splash_screen/animated_splash_screen.dart';

import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:permission_handler/permission_handler.dart';
import 'package:plussaveagent/views/home/home_screen.dart';
import 'package:plussaveagent/views/welcome_screen.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:google_fonts/google_fonts.dart';
import 'helper/internet_connectivity/connectivity_provider.dart';
void main() async{
  // await UserSimplePreferences.init();
  WidgetsFlutterBinding.ensureInitialized();
  await Permission.camera.request();
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key key}) : super(key: key);

  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _pname;
  @override
  void initState() {
    super.initState();
    _loadCounter();
  }

  _loadCounter() async {
    SharedPreferences prefs = await SharedPreferences.getInstance();
    setState(() {
      _pname = (prefs.getString('uid') ?? '');
    });
  }

  @override
  Widget build(BuildContext context) {
    return MultiProvider(
        providers: [
          ChangeNotifierProvider(
            create: (context) => ConnectivityProvider(),
            child: _pname == "" ? WelcomeScreen() : WelcomeScreen(),
          ),
        ],
        child: GetMaterialApp(
          title: 'Plus Save Financial Solutions',
          theme: ThemeData(
            fontFamily: 'Lato',
            primarySwatch: Colors.green,
          ),
          debugShowCheckedModeBanner: false,
          // home: TestPage(),
          home: AnimatedSplashScreen(
            duration:3000,
            // duration: 50000,
            splash: Column(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Image.asset(
                    'assets/app_logo_2.png',
                    height: 250,
                  ),
                  // SizedBox(height: 8),
                   Text(
                    "\"Plus Save Financial Solutions\"",
                    style:  const TextStyle(
                            color: Color(0xFF047434),
                            fontWeight: FontWeight.bold,
                            fontSize: 20),
                  )
                ]),
            nextScreen: _pname == "" ? WelcomeScreen() : WelcomeScreen(),
            splashTransition: SplashTransition.fadeTransition,
            // pageTransitionType: PageTransitionType.leftToRight,
            backgroundColor:  Colors.white,
            splashIconSize: 424,
          ),
          // routes: Routes.routes,
        ));
  }
}
