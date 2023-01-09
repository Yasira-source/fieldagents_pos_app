
import 'package:flutter/material.dart';

import 'constants_new.dart';

class DefaultButton extends StatelessWidget {
  final String btnText;
  final VoidCallback onPressed;
  const DefaultButton({
    Key key, this.btnText,  this.onPressed,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: MediaQuery.of(context).size.width,
      margin: EdgeInsets.symmetric(vertical: kDefaultPadding),
      padding: EdgeInsets.symmetric(horizontal: kDefaultPadding),
      child: TextButton(
        style: ButtonStyle(
        padding: MaterialStateProperty.all<EdgeInsets>(const EdgeInsets.symmetric(vertical: kLessPadding)),
        shape:MaterialStateProperty.all<RoundedRectangleBorder>( RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(kShape))),
        backgroundColor: MaterialStateProperty.all<Color>(kPrimaryColor)  ,
        foregroundColor: MaterialStateProperty.all<Color>(kWhiteColor),
        // highlightColor: kTransparent,
        ),
        onPressed: onPressed,
        child: Text(btnText.toUpperCase()),
      ),
    );
  }
}