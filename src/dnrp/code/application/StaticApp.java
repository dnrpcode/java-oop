package dnrp.code.application;

import static dnrp.code.data.Application.PROCESSORS;
import static dnrp.code.data.Constant.*;
import dnrp.code.data.Country;
import dnrp.code.util.MathUtil;

public class StaticApp {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(
        MathUtil.sum(1,1,1,1,1)
    );

    Country.City city = new Country.City();
    city.setName("Banjarnegara");

    System.out.println(city.getName());

    System.out.println(PROCESSORS);
  }
}
