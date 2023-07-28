package dnrp.code.application;

import dnrp.code.data.CreateUserRequest;
import dnrp.code.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("eko");
    request.setPassword("eko");
    request.setName("eko");

    ValidationUtil.validationReflection(request);

  }
}
