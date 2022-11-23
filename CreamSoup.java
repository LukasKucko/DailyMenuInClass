package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class CreamSoup {

  Random random = new Random();
  ArrayList<String> polievka2 = new ArrayList<>();

  public String creamSoup() {
    // add a various creme soups
    polievka2.add("Hrachová");
    polievka2.add("Kelová");
    polievka2.add("Karfiolová");
    polievka2.add("Hrášková - krémová polievka so slaninou (7)");
    polievka2.add("Držkova (1)");
    polievka2.add("Sedliacka polievka s krúpami,zeleninou,zemiakmi a klobásou (1)");
    polievka2.add("Hríbová so zemiakmi a zeleninou (1)");
    polievka2.add("Demikát s haluškami a slaninou (1,3,7)");
    polievka2.add("Fazuľová so zeleninou a údeným mäsom (1)");
    polievka2.add("Paradajková (0)");
    polievka2.add("Kukuricová krémová (1,7)");
    polievka2.add("Gulášová (1)");
    polievka2.add("Kapustová s mäsom a hríbami (12)");
    polievka2.add("Šošovicová na kyslo (7)");
    polievka2.add("Maďarská s klobásou a zemiakmi (0)");
    polievka2.add("Mrkvový krém s kokosovým mliekom a kari (0)");
    polievka2.add("Halászlé");
    polievka2.add("Paradajková so strúhaným eidamom (7)");

    return polievka2.get(random.nextInt(polievka2.size()));
  }
}
