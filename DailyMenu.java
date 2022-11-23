package sk.lukas;


public class DailyMenu {

   
    ClearSoup cs = new ClearSoup();
    CreamSoup crs = new CreamSoup();
    Poultry p = new Poultry();
    Pork po = new Pork();
    Special sp = new Special();
    Vegetarian v = new Vegetarian();
    Week w = new Week();
    
    public void dm(){
    for (int i = 0; i < 5; i++) {

      System.out.println(w.days[i]);

      System.out.println(
          "Polievky:     1.  " + cs.clearSoup() + "\n              2.  " + crs.creamSoup());
      System.out.println("Hlavné jedlá :1. " + p.poultry());
      System.out.println("              2. " + po.pork());
      System.out.println("              3. " + sp.special());
      System.out.println("              4. " + v.vegetarian() + "\n");
    }
    }
}
