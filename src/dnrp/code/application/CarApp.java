package dnrp.code.application;

import dnrp.code.data.Avanza;
import dnrp.code.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
