package dnrp.code.application;

import dnrp.code.annotation.Fancy;
import dnrp.code.data.LoginRequest;
import dnrp.code.error.ValidationException;
import dnrp.code.util.ValidationUtil;

public class ValidationApp {

  @Fancy(name = "AnimalApp", tags = {"application", "java"})
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("Dani", "rahasia");

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi");
    }


    LoginRequest loginRequest2 = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Sukses");

  }
}
