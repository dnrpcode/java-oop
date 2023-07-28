public class PolymorphismApp {
  public static void main(String[] args) {


    Employee employee = new Employee("Dani");
    employee.sayHello("Prayogi");

    employee = new Manager("Dani");
    employee.sayHello("Prayogi");

    employee = new VicePresident("Dani");
    employee.sayHello("Prayogi");

    sayHello(new Employee("Dani"));
    sayHello(new Manager("Ramadhan"));
    sayHello(new VicePresident("Prayogi"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello " + employee.name);
    }
  }
}
