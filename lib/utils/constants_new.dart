
import 'package:flutter/material.dart';



const kPrimaryColor = Color(0xFF1A8F00);
const kAccentColor = Color(0xFFF1F1F1);
const kWhiteColor = Color(0xFFFFFFFF);
const kLightColor = Color(0xFF808080);
const kDarkColor = Color(0xFF303030);
const kTransparent = Colors.transparent;

const kDefaultPadding = 24.0;
const kLessPadding = 10.0;
const kFixPadding = 16.0;
const kLess = 4.0;

const kShape = 30.0;

const kRadius = 0.0;
const kAppBarHeight = 56.0;

const kHeadTextStyle = TextStyle(
  fontSize: 24.0,
  fontWeight: FontWeight.bold,
);

const kSubTextStyle = TextStyle(
  fontSize: 18.0,
  color: kLightColor,
);

const kTitleTextStyle = TextStyle(
  fontSize: 20.0,
  color: kPrimaryColor,
);

const kDarkTextStyle = TextStyle(
  fontSize: 20.0,
  color: kDarkColor,
);

const kDivider = Divider(
  color: kAccentColor,
  thickness: kLessPadding,
);

const kSmallDivider = Divider(
  color: kAccentColor,
  thickness: 5.0,
);

const String pieChart = 'assets/images/pieChart.png';
const String trophy = 'assets/images/trophy.png';
const String chat = 'assets/images/chat.png';
const String whiteShape = 'assets/images/whitebg.svg';
const String logo = 'assets/images/ic_launcher.png';
const String profile = 'assets/images/profile.jpg';
const String bg = 'assets/images/background.jpg';
const String manShoes = 'assets/images/ebook.png';
const String success = 'assets/images/success.gif';
const String chatBubble = 'assets/images/emptyChat.png';
const String emptyOrders = 'assets/images/orders.png';
const String callCenter = 'assets/images/center.png';
const String conversation = 'assets/images/conversation.png';

List<Map<String, String>> introData = [
  {
    'image': pieChart,
    'headText': 'Track your routine',
    'descText':
        "Whether it's sets, reps, weight used, you can track it all with our intuitive interface.",
  },
  {
    'image': trophy,
    'headText': 'Set personal goals',
    'descText':
        "We're all in the gym for a reason: goals. set goals for diet and fitness.",
  },
  {
    'image': chat,
    'headText': 'Chat with others',
    'descText': "Inspire and help each other reach fitness and diet goals.",
  },
];

final labels = [
  'Notifications',
  'Payments',
  'Message',
  'My Orders',
  'Edit Profile',
  'Call Center',
  'About Application',
  'App Referrals',
  'Sign Out',
];

final primary = [
  'assets/class_img/p1.png',
  'assets/class_img/p2.png',
  'assets/class_img/p3.png',
  'assets/class_img/p4.png',
  'assets/class_img/p5.png',
  'assets/class_img/p6.png',
  'assets/class_img/p7.png',
 
];

final primaryWords = [
  'Pri.One',
  'Pri.Two',
  'Pri.Three',
  'Pri.Four',
  'Pri.Five',
  'Pri.Six',
  'Pri.Seven',
 
 
];

final primaryCount = [
  1,
  2,
  3,
  4,
  5,
  6,
  7,


];

final olevelCount = [
  8,
  9,
  10,
  11,

];
final alevelCount = [
  12,
  13,

];

final olevelnewCount = [
  25,
  26,
  27,
  28,
];
final olevel = [
  'assets/class_img/s1.png',
  'assets/class_img/s2.png',
  'assets/class_img/s3.png',
  'assets/class_img/s4.png',
 
];

final olevelWords = [
  'Senior One',
  'Senior Two',
  'Senior Three',
  'Senior Four',
 
 
];

final alevel = [
  'assets/class_img/s5.png',
  'assets/class_img/s6.png',
 
];

final alevelWords = [
  'Senior Five',
  'Senior Six',
 
 
];
final icons = [
  Icons.notifications,
  Icons.payment,
  Icons.message,
  Icons.local_dining,
  Icons.settings,
  Icons.call,
  Icons.info,
  Icons.person,
  Icons.school_outlined,
  Icons.logout_outlined
];

final paymentLabels = [
  'Credit card / Debit card',
  'Cash on delivery',
  'Paypal',
  'Google wallet',
];

final paymentIcons = [
  Icons.credit_card,
  Icons.money_off,
  Icons.payment,
  Icons.account_balance_wallet,
];

final settingLabel = [
  'Account',
  'Address',
  'Telephone',
  'Email',
  'Setting',
  'Order Notifications',
  'Discount Notifications',
  'Credit Card',
  'Logout',
];

List<String> chipsMobile = [
  "IPhone",
  "Samsung",
  "OnePlus",
  "RealMe",
  "Xiomi",
  "Oppo",
  "Vivo",
];

List<String> chipsCategory = [
  "Mobiles",
  "Cloths",
  "Electronics",
  "Furnitures",
  "Shoes",
  "Laptops",
  "Watches",
];

final List<String> sliderImages = [
  "assets/images/books.jpg",
  "assets/images/cameras.jpg",
  "assets/images/mensShoes.jpg",
  "assets/images/watches.jpg",
  "assets/images/headphones.jpg",
  "assets/images/girlsFootwear.jpg",
  "assets/images/joysticks.jpg",
  "assets/images/desktop.jpg",
  "assets/images/gymEquipments.jpg",
];

final menuLabels = [
  'Camera',
  "Furniture",
  'Headphone',
  'Gaming',
  'Fashion',
  'Health Care',
  'Computer',
  'Equipment',
  'Sport',
  'Ticket',
  'Books',
  'Cloths',
];

final menuIcons = [
  Icons.camera,
  Icons.home,
  Icons.headset,
  Icons.games,
  Icons.format_shapes,
  Icons.healing,
  Icons.computer,
  Icons.equalizer,
  Icons.gamepad,
  Icons.traffic,
  Icons.book,
  Icons.collections,
];



