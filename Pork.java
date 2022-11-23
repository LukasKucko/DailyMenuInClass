package sk.lukas;

import java.util.ArrayList;
import java.util.Random;

public class Pork {

  ArrayList<String> bravcove = new ArrayList<>();

  Random random = new Random();

  public String pork() {

    // pork meals
    bravcove.add("Bravčové kocky");
    bravcove.add("Zapekané karé");
    bravcove.add(" 120g Bravčová kapsa(vyprážaná) : slaninka,syr,feferónka,pyré (1,3,7)");
    bravcove.add(" 120g Kotlikový guláš,2ks chlieb (1,3,7)");
    bravcove.add(" 120g Segedínsky guláš z bravčového stehna,parená knedľa (1,3,7,12)");
    bravcove.add(" 120g Bravčové guľky s dubákovou omáčkou,krokety (7)");
    bravcove.add(" 120g Sviečková na smotane (hovádzie mäso),kysnutá knedľa (1,3,7)");
    bravcove.add(" 120g Bravčové rezníky v syrovom cestíčku,zemiakové pyre (1,3,7)");
    bravcove.add(" 120g Hovädzie stehno na hrášku,tarhoňa (1,3)");
    bravcove.add(" 120g Bravčová fašírka s kelovo-zemiakovým prívarkom (1,3,7)");
    bravcove.add(
        " 120g Bravčový steak,volské oko,slaninka,omáčka zo zeleného korenia,ryža (1,3,7)");
    bravcove.add(" 120g Pečená bravčová krkovička,biela dusená kapusta,parená knedľa (1,3,7,12)");
    bravcove.add(" 120g Plátky z bravčového karé na šampiňónoch,ryža (7)");
    bravcove.add(" 120g Bravčové stehno ,,Hamburg,, (šunka,uhorka,smotana),kysnutá knedľa (1,3,7)");
    bravcove.add(" 120g Čiernohorsky rezeň(bravč.),strúhaný syr,zem.pyré,kapustový šalát (1,3,7)");
    bravcove.add(" 250g Ceatoviny ,,Carbonara,, (smotana,mäsová slaninka,paemezán) (1,3,7)");

    return bravcove.get(random.nextInt(bravcove.size()));
  }
}
