class BootcampDetails {

  final String id;
  final String accno;
  final String accnames;
 


  // "store_id" => $category_id,
  // "store_name" => $category_name,
  // "store_location" => $category_slag

  BootcampDetails({ this.id, this.accno,this.accnames});

  factory BootcampDetails.fromJson(Map<String, dynamic> json) {
    return BootcampDetails(
      id: json['id'].toString(),
      accno: json['accno'].toString(),
      accnames: json['accnames'].toString(),
    

    );
  }
}