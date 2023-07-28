package dnrp.code.data;

class SocialMedia {
  String name;
}

class Facebook extends SocialMedia {

  final void login(String username, String password){
    // isi method
  }

}

class FakeFacebook extends Facebook {

  // ERROR
  // void login(String username, String password){
    // isi method
  // }

}
