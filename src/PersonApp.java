public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Dani", "Banjarnegara");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Prayogi");

    Person person2 = new Person("Dani");

    Person person3;
    person3 = new Person();
    person3.name = "Ramadhan";
    person3.sayHello("Prayogi");

  }
}
