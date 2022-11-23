package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class Vegetarian {

  ArrayList<String> bezmasite = new ArrayList<>();

  Random random = new Random();

  public String vegetarian() {

    // vegetarian meals
    bezmasite.add(" 240g Dubakové rizoto s parmezánom,rukolou a cherry paradajkami (7)");
    bezmasite.add("Zeleninový šalát");
    bezmasite.add(" 250g Zapekaná brokolica so syrovou omáčkou,varené zemiaky (3,7)");
    bezmasite.add(" 250g Lievance s ovocím a karamelom (1,3,7)");
    bezmasite.add(" 250g Tortilla plnená zeleninou a syrom cheddar,smotanový dressing (1,3,7)");
    bezmasite.add(" 250g Šúľance : orechová alebo maková posýpka,preliate maslom (1,3,7)");
    bezmasite.add(" 120g Encián v zemiakovom cestíčku,zemiakové pyré (1,3,7)");
    bezmasite.add(" 250g Dukátové buchtičky (domáce) s vanilkovým krémom (1,3,7)");
    bezmasite.add(" 250g Šalát s pohánkou,feta syrom,cherry paradajkami a hriankami (1,3,7)");
    bezmasite.add(" 250g Marhuľové parené buchty,posýpka: granko # orechy # mak,preliate maslom");

    return bezmasite.get(random.nextInt(bezmasite.size()));
  }
}
