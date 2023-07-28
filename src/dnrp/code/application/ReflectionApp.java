package dnrp.code.application;

import dnrp.code.data.CreateUserRequest;
import dnrp.code.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("Dani");
    request.setPassword("Dani");
    request.setName("Dani");

    ValidationUtil.validationReflection(request);

  }
}
