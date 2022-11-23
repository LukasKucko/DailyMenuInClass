package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class ClearSoup {

  Random random = new Random();
  ArrayList<String> polievka = new ArrayList<>();

  public String clearSoup() {

    polievka.add("Hrášková vývarová");
    polievka.add("Slepačí vývar so zeleninou,mäsom a rezancami (1,3,7)");

    polievka.add("Bažantí vývar");
    polievka.add("Divinový vývar");
    polievka.add("Zeleninová (číra) polievka s mrveničkou (1,3)");
    polievka.add("Teľací vývar s mäsom a špenátovými haluškami (1,3,7)");
    polievka.add("Hovädzia polievka s mäsom a zeleninou,celestínske rezance (1,3,7)");
    polievka.add("Pórová polievka so zemiakmi a pohánkou (1)");
    polievka.add("Pytliacka polievka(divinové mäso,pór,hríby,chilli) (0)");
    polievka.add("Ostrokyslá polievka (3,4,6,9,11)");
    polievka.add("Cesnaková (číra) polievka so zemiakmi a mletým hovädzím mäsom (0)");
    polievka.add("Francúzska cibuľová polievka s krutónmi");
    polievka.add("Hovädzí vývar so špenátovými haluškami a zeleninou (1,3,7)");
    polievka.add("Francúzska polievka so zeleninou,mäsom a cestovinou (1,3)");
    polievka.add("Vývar s pečeňovými haluškami a zeleninou (1,3)");

    return polievka.get(random.nextInt(polievka.size()));
  }
}
