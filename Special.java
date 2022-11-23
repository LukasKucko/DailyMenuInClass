package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class Special {

  ArrayList<String> drahe = new ArrayList<>();

  Random random = new Random();

  public String special() {

    // special meals
    drahe.add("Losos na masle");
    drahe.add("Hovädzí steak");
    drahe.add(" 150g Flank steak,coleslaw šalát,hranolky (3,7)");
    drahe.add(" 150g Losos pečený na masle,holandská omáčka,zemiakové pyré (3,4,7,12)");
    drahe.add(" 150g Pleskavica (teľacie mäso),pečené zemiaky,čalamáda (12)");
    drahe.add(" 150g Sumček africký zapekaný v parmezánovej kruste,zemiakové pyré (4,7)");
    drahe.add(" 150g Medajlónky z panenky v slaninke,prírodná omáčka,pečené zemiaky (0)");
    drahe.add(" 150g Pomaly pečený hovädzí krk,restované šúlance (0)");
    drahe.add(" 150g Chrbát z tresky,gratinované zemiaky,citrónová omáčka (3,4,7)");
    drahe.add(" 150g Pečená panenka,dubáková omáčka,žemlová knofla (1,3,7)");
    drahe.add(" 150g Rybie kúsky v pivnom cestíčku,batátové hranolky,tatárska omáčka (1,3,4,7)");
    drahe.add(" 150g Burger s trhaným kačacím mäsom,coleslaw šalát (0)");
    drahe.add(" 150g Vysmážané rybie kúskyv parmezán. cestíčku,šalát,pita chlieb,dressing (1,3,7)");
    drahe.add(
        " 150g Hovädzia sviečkovica s udon rezancami a zeleninou,pečená cibuľka,arašídy (1,5,6,11)");
    drahe.add(" 150g Treska pečená na masle,zwmiakové pyré,špenátová omáčka (4,7)");
    drahe.add(" 150 Pečená panenka so slivkovou omáčkou,zemiakové krokety (1,3)");

    return drahe.get(random.nextInt(drahe.size()));
  }
}
