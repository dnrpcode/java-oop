package dnrp.code.application;

import dnrp.code.annotation.Fancy;
import dnrp.code.data.Animal;
import dnrp.code.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
  public static void main(String[] args) {


    Animal animal = new Cat();
    animal.name = "Puss";
    animal.run();

  }
}
