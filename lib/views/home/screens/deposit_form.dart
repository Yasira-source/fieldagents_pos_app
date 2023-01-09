import 'dart:convert';
import 'dart:io';
import 'package:plussaveagent/views/home/screens/data_page.dart';
import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:intl_phone_field/intl_phone_field.dart';
import 'package:ionicons/ionicons.dart';
import 'package:searchfield/searchfield.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:http/http.dart' as http;
import 'package:get/get.dart';

import '../../../controller/sign_in_controller.dart';
import '../../../models/bootcamp_details.dart';
import '../../../utils/components/custom_surfix_icon.dart';
import '../../../utils/constants.dart';

class DepositForm extends StatefulWidget {
  DepositForm({Key key,  this.dropdownvalue, this.uid}) : super(key: key);
// Initial Selected Value
  String dropdownvalue;
  String uid;
  @override
  State<DepositForm> createState() => _DepositFormState();
}

class _DepositFormState extends State<DepositForm> {
  final _formKey = GlobalKey<FormState>();

  final List<String> errors = [];
  var result;
  void addError({String error}) {
    if (!errors.contains(error)) {
      setState(() {
        errors.add(error);
      });
    }
  }

  int _currentTimeValue = 1;
  void removeError({String error}) {
    if (errors.contains(error)) {
      setState(() {
        errors.remove(error);
      });
    }
  }

  final controller = SignInController();
 
  String mobile = '';
  String amount = '';
  String reason = '';
  String depositedby = '';
  String _selectedMember = '';

  String _selectedAccno = '';
  String _selectedAccName = '';
  String _selectedMid = '';

  String _selectedFAccno = '';
  String _selectedFAccName = '';
  String _selectedFMid = '';

  String _splitBracket = '';

 String dropdownvalue1 = 'Savings Wallet';
    var itemsn = [
    'Savings Wallet',
    'Loans Wallet',
  ];

  final String url =
      "http://admin.plussavefinancial.com/api/api/member/get_app_members.php";
  List<String> data = []; //line
  List datan = []; //line
  Future<String> getSWData() async {
    var res =
        await http.get(Uri.parse(url), headers: {"Accept": "application/json"});
    var resBody = json.decode(res.body);
    // print(resBody);
    setState(() {
      for (var i = 0; i < resBody.length; i++) {
        data.add(resBody[i].toString());
      }
      // data = resBody;
    });

    return "Sucess";
  }

  @override
  void initState() {
    this.getSWData();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFFeff5f3),
      appBar: AppBar(
        backgroundColor: const Color(0xFF02a54d),
        title: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: const [
            Text(
              "Member Deposit Form",
              style: TextStyle(color: Colors.white),
            ),
            SizedBox(
              height: 6,
            ),
          ],
        ),
      ),
      body: SingleChildScrollView(
        child: Center(
          child: Padding(
            padding: const EdgeInsets.all(12.0),
            child: Column(
              children: [
                // const SizedBox(
                //   height: 10,
                // ),
                Padding(
                  padding: EdgeInsets.all(10.0),
                  child: Text(
                    'Select a Member',
                    style: TextStyle(fontSize: 16, color: Colors.blueGrey),
                  ),
                ),
                Container(
                  width: double.infinity,
                  margin: EdgeInsets.symmetric(horizontal: 20),
                  decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.circular(10),
                    boxShadow: [
                      BoxShadow(
                        color: Colors.grey.withOpacity(0.2),
                        blurRadius: 10,
                        offset: Offset(0, 10),
                      ),
                    ],
                  ),
                  child: SearchField(
                    hint: 'Search Using Names',
                    searchInputDecoration: InputDecoration(
                      enabledBorder: OutlineInputBorder(
                        borderSide: BorderSide(
                          color: Colors.blueGrey.shade200,
                          width: 1,
                        ),
                        borderRadius: BorderRadius.circular(10),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderSide: BorderSide(
                          width: 2,
                          color: Colors.green.withOpacity(0.8),
                        ),
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                    maxSuggestionsInViewPort: 6,
                    itemHeight: 50,
                    suggestionsDecoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(10),
                    ),
                    onTap: (value) {
                      setState(() {
                        _selectedMember = value;

                        _splitBracket = value.substring(1, value.length - 1);

                        final split = _splitBracket.split(',');
                        final Map<int, String> values = {
                          for (int i = 0; i < split.length; i++) i: split[i]
                        };

                        _selectedAccno = values[1];
                        _selectedFAccno = _selectedAccno.split(':')[1];
                        _selectedAccName = values[2];
                        _selectedFAccName = _selectedAccName.split(':')[1];

                        _selectedMid = values[0];
                        _selectedFMid = _selectedMid.split(':')[1];
                      });

                      // print(_selectedFAccno);
                      // print(_selectedFAccName);
                      // print(_selectedFMid);
                    },
                    suggestions: data,
                  ),
                ),
                // SizedBox(
                //   height: 10,
                // ),
               

                     Padding(
                  padding: EdgeInsets.only(top:20.0),
                  child: Text(
                    'Select Wallet',
                    style: TextStyle(fontSize: 16, color: Colors.blueGrey),
                  ),
                ),
                DropdownButton(
                  // Initial Value
                  value: dropdownvalue1,

                  // Down Arrow Icon
                  icon: const Icon(Icons.keyboard_arrow_down),

                  // Array list of items
                  items: itemsn.map((String items) {
                    return DropdownMenuItem(
                      value: items,
                      child: Text(items),
                    );
                  }).toList(),
                  // After selecting the desired option,it will
                  // change button value to selected value
                  onChanged: (String newValue) {
                    setState(() {
                      dropdownvalue1 = newValue;
                    });
                  },
                ),
                SizedBox(
                  height: 10,
                ),
                IntlPhoneField(
                  initialCountryCode: "UG",
                  // controller: phoneController,
                  decoration: const InputDecoration(
                    labelText: 'Phone Number',
                    border: OutlineInputBorder(
                      borderSide: BorderSide(),
                    ),
                  ),
                  onChanged: (phone) {
                    setState(() {
                      mobile = phone.number;
                    });
                  },
                  onCountryChanged: (country) {
                    // if (kDebugMode) {
                    //   print('Country changed to: ' + country.name);
                    // }
                  },
                ),
                const SizedBox(height: 10),
                buildAmountFormField(),
                const SizedBox(height: 10),
                buildReasonFormField(),
                const SizedBox(height: 10),
                buildNamesFormField(),
                const SizedBox(
                  height: 10,
                ),
                SizedBox(
                  height: 60,
                  width: 140,
                  child: InkWell(
                    onTap: () {
                      showDialog(
                        context: context,
                        builder: (context) => AlertDialog(
                          title: Text('Confirm Details first !'),
                          content: RichText(
                            text: TextSpan(
                              text: '${widget.dropdownvalue} Deposit\n',
                              style: const TextStyle(
                                fontSize: 14.0,
                                color: Colors.black,
                              ),
                              children: <TextSpan>[
                                TextSpan(text: '${dropdownvalue1}\n'),
                                TextSpan(text: '${_selectedAccName}\n'),
                                TextSpan(text: '${_selectedAccno}\n'),
                                TextSpan(text: 'Amount: ${amount}\n'),
                                TextSpan(text: 'Reason: ${reason}\n'),
                                TextSpan(text: 'Deposited By: ${depositedby}'),
                              ],
                            ),
                          ),
                          actions: [
                            ElevatedButton(
                                onPressed: () async{

 result = await controller.postData(_selectedFMid,  reason,'1',widget.uid,_selectedFAccName,mobile, amount,_selectedFAccName,widget.dropdownvalue,dropdownvalue1);
                             
                                var got = json.decode(result);
                      // print(got);
                      if (got[0]['message'] == 'Yes') {
                                 Get.to(()=> DataPage(
                                              got[0]['_did']
                                                  .toString(),
                                              got[0]['_account_no']
                                                  .toString(),
                                              got[0]['account_name']
                                                  .toString(),
                                              got[0]['_authorisedby']
                                                  .toString(),
                                              got[0]['_paidby_name']
                                                  .toString(),
                                              got[0]['_paidby_phone']
                                                  .toString(),
                                              got[0]['_amount']
                                                  .toString(),
                                              got[0]['_reason']
                                                  .toString(),
                                              got[0]['_status']
                                                  .toString(),
                                              'Head Office - Main Branch',
                                              got[0]['acc_balance']
                                                  .toString(),
                                              got[0]['pending']
                                                  .toString(),
                                              got[0]['_date_created']
                                                  .toString(),
                                                  got[0]['wallet']
                                                  .toString()
                                                  ));
                                

                                  //Send to API
                                } else {
                                  showDialog(
                                    context: context,
                                    builder: (ctx) => AlertDialog(
                                      title: Text("Deposit failed !"),
                                      content: Text("Kindly Try again !"),
                                      actions: <Widget>[
                                        ElevatedButton(
                                          onPressed: () {
                                           
                                            Navigator.of(ctx).pop();
                                          },
                                          child: Text("Try again"),
                                        ),
                                      ],
                                    ),
                                  );
                                }
                           
                                }, child: Text('Confirm')),
                            ElevatedButton(
                                onPressed: () {
                                  Navigator.pop(context);
                                },
                                child: Text('Change'))
                          ],
                        ),
                      );
                    },
                    child: Container(
                      alignment: Alignment.center,
                      decoration: BoxDecoration(
                        color: const Color(0xFF02a54d),
                        borderRadius: BorderRadius.circular(15),
                      ),
                      child: Text(
                        'Deposit',
                        style: GoogleFonts.poppins(
                          fontSize: 15,
                          fontWeight: FontWeight.w500,
                          color: Colors.white,
                        ),
                      ),
                    ),
                  ),
                ),
                const SizedBox(
                  height: 10,
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }

  TextFormField buildAmountFormField() {
    return TextFormField(
      keyboardType: TextInputType.number,
      onSaved: (newValue) => setState(() {
        amount = newValue;
      }),
      onChanged: (value) {
        if (value.isNotEmpty) {
          removeError(error: kEmailNullError);
          setState(() {
            amount = value;
          });
        }
        return;
      },
      validator: (value) {
        if (value.isEmpty) {
          addError(error: kEmailNullError);
          return "";
        } else if (!emailValidatorRegExp.hasMatch(value)) {
          addError(error: kInvalidEmailError);
          return "";
        }
        return null;
      },
      decoration: const InputDecoration(
        labelText: "Amount",
        hintText: "Enter amount to deposit",
        // If  you are using latest version of flutter then lable text and hint text shown like this
        // if you r using flutter less then 1.20.* then maybe this is not working properly
        floatingLabelBehavior: FloatingLabelBehavior.always,
        // suffixIcon: CustomSurffixIcon(svgIcon: "assets/icons/Mail.svg"),
      ),
    );
  }

  TextFormField buildReasonFormField() {
    return TextFormField(
      initialValue: widget.dropdownvalue,
      keyboardType: TextInputType.text,
      onSaved: (newValue) => setState(() {
        reason = newValue;
      }),
      onChanged: (value) {
        if (value.isNotEmpty) {
          removeError(error: kEmailNullError);
          setState(() {
            reason = value;
          });
        }
        return;
      },
      validator: (value) {
        if (value.isEmpty) {
          addError(error: kEmailNullError);
          return "";
        } else if (!emailValidatorRegExp.hasMatch(value)) {
          addError(error: kInvalidEmailError);
          return "";
        }
        return null;
      },
      decoration: const InputDecoration(
        labelText: "Reason",
        hintText: "Enter reason",
        // If  you are using latest version of flutter then lable text and hint text shown like this
        // if you r using flutter less then 1.20.* then maybe this is not working properly
        floatingLabelBehavior: FloatingLabelBehavior.always,
        // suffixIcon: CustomSurffixIcon(svgIcon: "assets/icons/Mail.svg"),
      ),
    );
  }

  TextFormField buildNamesFormField() {
    return TextFormField(
      keyboardType: TextInputType.text,
      onSaved: (newValue) => setState(() {
        depositedby = newValue;
      }),
      onChanged: (value) {
        if (value.isNotEmpty) {
          removeError(error: kEmailNullError);
          setState(() {
            depositedby = value;
          });
        }
        return;
      },
      validator: (value) {
        if (value.isEmpty) {
          addError(error: kEmailNullError);
          return "";
        } else if (!emailValidatorRegExp.hasMatch(value)) {
          addError(error: kInvalidEmailError);
          return "";
        }
        return null;
      },
      decoration: const InputDecoration(
        labelText: "Deposited By",
        hintText: "",
        // If  you are using latest version of flutter then lable text and hint text shown like this
        // if you r using flutter less then 1.20.* then maybe this is not working properly
        floatingLabelBehavior: FloatingLabelBehavior.always,
        // suffixIcon: CustomSurffixIcon(svgIcon: "assets/icons/Mail.svg"),
      ),
    );
  }
}
