import 'dart:typed_data';
import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_sunmi_printer/flutter_sunmi_printer.dart';

import '../../../utils/constants.dart';

class PrintPage extends StatefulWidget {
  String _did;
  String _account_no;
  String account_name;
  String _authorisedby;
  String _paidby_name;
  String _paidby_phone;
  String _amount;
  String _reason;
  String _status;
  String branch_name;
  String acc_balance;
  String pending;
  String _date_created;
  String wallet;

  PrintPage(
      this._did,
      this._account_no,
      this.account_name,
      this._authorisedby,
      this._paidby_name,
      this._paidby_phone,
      this._amount,
      this._reason,
      this._status,
      this.branch_name,
      this.acc_balance,
      this.pending,
      this._date_created,
      this.wallet);
  @override
  _PrintPageState createState() => _PrintPageState();
}

class _PrintPageState extends State<PrintPage> {
  void _print() async {
    // Test regular text
    SunmiPrinter.hr();
    SunmiPrinter.text(
      'PLUS SAVE FINANCIAL SOLUTIONS',
      styles: SunmiStyles(bold: true, align: SunmiAlign.center),
    );
    SunmiPrinter.hr();
    // Test image
    ByteData bytes = await rootBundle.load('assets/app_logo_2.png');
    final buffer = bytes.buffer;
    final imgData = base64.encode(Uint8List.view(buffer));
    SunmiPrinter.image(imgData);
    SunmiPrinter.emptyLines(1);

    SunmiPrinter.text(
      'ACCOUNT DETAILS',
      styles: SunmiStyles(align: SunmiAlign.center),
    );
    SunmiPrinter.hr();
    // Test align
    SunmiPrinter.text(
      'A/C: ${this.widget._account_no}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.text(
      'Names: ${this.widget.account_name}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.text(
      'Date: ${this.widget._date_created}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.text(
      'DEPOSIT SLIP - (${this.widget.wallet})',
      styles:
          SunmiStyles(bold: true, underline: true, align: SunmiAlign.center),
    );
    SunmiPrinter.text(
      'REF: ${this.widget._did}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.text(
      'Amount: UGX ${this.widget._amount}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.text(
      'Authorised by: ${this.widget._authorisedby}',
      styles: SunmiStyles(bold: true, underline: false),
    );
    SunmiPrinter.emptyLines(2);

    SunmiPrinter.hr();

    SunmiPrinter.text(
      'Thank you for saving with Us',
      styles:
          SunmiStyles(bold: true, underline: false, align: SunmiAlign.center),
    );
    // Test align
    // SunmiPrinter.text(
    //   'left',
    //   styles: SunmiStyles(bold: true, underline: true),
    // );
    // SunmiPrinter.text(
    //   'center',
    //   styles:
    //       SunmiStyles(bold: true, underline: true, align: SunmiAlign.center),
    // );
    // SunmiPrinter.text(
    //   'right',
    //   styles: SunmiStyles(bold: true, underline: true, align: SunmiAlign.right),
    // );

    // Test text size
    // SunmiPrinter.text('Extra small text',
    //     styles: SunmiStyles(size: SunmiSize.xs));
    // SunmiPrinter.text('Medium text', styles: SunmiStyles(size: SunmiSize.md));
    // SunmiPrinter.text('Large text', styles: SunmiStyles(size: SunmiSize.lg));
    // SunmiPrinter.text('Extra large text',
    //     styles: SunmiStyles(size: SunmiSize.xl));

    // Test row
    // SunmiPrinter.row(
    //   cols: [
    //     SunmiCol(text: 'col1', width: 4),
    //     SunmiCol(text: 'col2', width: 4, align: SunmiAlign.center),
    //     SunmiCol(text: 'col3', width: 4, align: SunmiAlign.right),
    //   ],
    // );

    SunmiPrinter.emptyLines(3);
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          automaticallyImplyLeading: true,
          backgroundColor: kPrimaryColor,
          title: const Text('Select Printer'),
        ),
        body: Column(
          children: <Widget>[
            SizedBox(height: 50),
            Center(
              child: ElevatedButton(
                onPressed: _print,
                child:
                    const Text('Print Receipt', style: TextStyle(fontSize: 20)),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
