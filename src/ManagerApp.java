public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager("Dani");
    manager.sayHello("Prayogi");

    var vp = new VicePresident("Nur");
    vp.sayHello("Ramadhan");

    System.out.println(manager);
    System.out.println(manager.toString());
    System.out.println(vp);
    System.out.println(vp.toString());
  }
}
