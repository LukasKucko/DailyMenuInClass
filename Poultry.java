package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class Poultry {

  ArrayList<String> hydina = new ArrayList<>();
  Random random = new Random();

  public String poultry() {

    // poultry meals
    hydina.add("Morčací gordon");
    hydina.add(" 120g Kurací paprikáš,maslové halušky");
    hydina.add(" 120g Kurací závitok plnený šunkou a špenátom,demiglace omáčka,ryža (7)");
    hydina.add(" 120g Soté Kung Pao (kuracie mäso,arašídy,smažená cibuľka),ryža (5,6,11)");
    hydina.add(" 120g Kuracie prsia v syrovom cestíčku,zemiakové pyré (1,3,7)");
    hydina.add(" 120g Gyros z morčacieho mäsa,tzatziki,ryza (7)");
    hydina.add(" 120g Kuracie prsia zapekané s paradajkou a mozarellou,ryza (7)");
    hydina.add(" 150g ,,Caesar šalát,,: kuracie mäso,chlebové krutóny,sardelový dressing (0)");
    hydina.add(" 250g Lasagne s kuracím mäsom,špenátom a syrom mozarrela (1,3,7)");
    hydina.add(" 200g Tortilla:pečené kuracie mäso,šalát,americký dressing,hranolky (1,3,7)");
    hydina.add(" 120g Kuracie ,,Catsu Curry,, (karí),jasmínová ryža (0)");
    hydina.add(" 120g Kuracie soté na smotane so šampiónmi,hráškom a pórom,ryža (1,7)");
    hydina.add(" 120g Kuracie prsia v slaninkovom cestíčku,zemiakové pyré (1,3,7)");
    hydina.add(" 250g Tortila: kuracie mäso so šalátom,cesnakový dressing,pečené zemiaky (1,3,7)");
    hydina.add(" 120g Morčací paprikáš (smotanový), cestovina (1,3,7)");
    hydina.add(
        " 120g Kuracie prsia v panko strúhanke,sweet-chilli,sezamová ryža,listový šalát (1,6,11)");
    hydina.add(" 120g Kuracia kapsa (na prírodno): údený syr,slanina,mladá cibuľa,ryža (7)");

    return hydina.get(random.nextInt(hydina.size()));
  }
}
