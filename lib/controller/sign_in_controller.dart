
import 'package:plussaveagent/controller/base_controller.dart';
import 'package:plussaveagent/services/base_client.dart';
import 'package:get/get.dart';

class SignInController extends GetxController with BaseController {
  // var loginData = <Data>[].obs;
  

  getData(String username, String password) async {
    showLoading('Authenticating data...');
    var response = await BaseClient()
        .get('http://admin.plussavefinancial.com/',
            'api/api/employee/app_login.php?username=$username&password=$password')
        .catchError(handleError);
    if (response == null) return;
    hideLoading();
    // print(response);
  
    return response;
  }

    postData(String mid, String reason,String branch,String authorized,String pay_name,String pay_phone,String amount,String acc_names,String ttype,String wallet) async {
    showLoading('Processing data...');
    var response = await BaseClient()
        .get('http://admin.plussavefinancial.com/',
            'api/api/deposit/create_deposit_agent.php?mid=$mid&reason=$reason&authorized=$authorized&pay_name=$pay_name&pay_phone=$pay_phone&amount=$amount&acc_name=$acc_names&ttype=$ttype&wallet=$wallet')
        .catchError(handleError);
    if (response == null) return;
    hideLoading();
    // print(response);
  
    return response;
  }


}
