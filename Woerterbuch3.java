package bibliothekdrei;
import java.util.TreeSet;
import java.lang.Comparable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public  class Woerterbuch3  implements Woerterbuch {
    private TreeSet<Woerterbucheintrag> woerterbucheintraege = new TreeSet<>();
    
    public Woerterbuch3 (String[] worte){
        for(int i =0; i <worte.length; ++i){
            woerterbucheintraege.add(new Woerterbucheintrag(worte[i],1));
        }
    }
    
    public Woerterbucheintrag suchen(String wort){
        Woerterbucheintrag result = null;
        
        for (Woerterbucheintrag w: woerterbucheintraege){
            if(w.getWort().equals(wort)){
                result = w;
            }
        }
            
        return result;
    }
    
    public void einfuegen(String wort){ 
        
        for(Woerterbucheintrag w: woerterbucheintraege){
            if(w.getWort().equals(wort)){
                w.setHaeufigkeit();
            } else {
                woerterbucheintraege.add(new Woerterbucheintrag(wort,1));
            }
        }
      
        }
        
    
    public void loeschen (String wort){
        for(Woerterbucheintrag w: woerterbucheintraege){
            if(w.getWort().equals(wort)){
                woerterbucheintraege.remove(w);
            }
        }
        
    }
    public void print(){
        for(Woerterbucheintrag w: woerterbucheintraege){
            System.out.println(w);
        }
        
    }
}