package dnrp.code.application;

public class EqualsApp {
  public static void main(String[] args) {


    String first = "Dani";
    first = first + " " + "Prayogi";

    System.out.println(first);

    String second = "Dani Prayogi";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Dani Prayogi";

    System.out.println(second == third);
    System.out.println(second.equals(third));

  }
}
