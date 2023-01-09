import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter_inappwebview/flutter_inappwebview.dart';

class MyWebView extends StatefulWidget {
  MyWebView({
    Key key,
     this.title,
     this.selectedUrl,
  }) : super(key: key);
  final String title;
  final String selectedUrl;
  @override
  _MyWebViewState createState() => _MyWebViewState();
}

class _MyWebViewState extends State<MyWebView> {
  final _key = UniqueKey();
  double _progress = 0;
   InAppWebViewController webview;
  GlobalKey<ScaffoldState> scaffoldKey = GlobalKey<ScaffoldState>();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        key: scaffoldKey,
        appBar: AppBar(
          backgroundColor: const Color(0xff047434),
          title: Text(widget.title),
        ),
        body: Stack(children: <Widget>[
          InAppWebView(
            initialUrlRequest: URLRequest(url: Uri.parse(widget.selectedUrl)),
            onWebViewCreated: (InAppWebViewController controller) {
              webview = controller;
            },
            onProgressChanged:
                (InAppWebViewController controller, int progress) {
              setState(() {
                _progress = progress / 100;
              });
            },
          
          ),
          _progress < 1
              ? SizedBox(
                  height: 3,
                  child: LinearProgressIndicator(
                    value: _progress,
                    backgroundColor: Colors.red,
                  ),
                )
              : Stack()
        ]));
  }
}
