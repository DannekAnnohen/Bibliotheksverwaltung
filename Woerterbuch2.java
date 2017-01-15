package bibliothekdrei;

import java.util.Arrays;
import java.util.HashMap;


public class Woerterbuch2  implements Woerterbuch {
    
    private HashMap <String ,Woerterbucheintrag> woerterbucheintraege = new HashMap<>();
     
    public Woerterbuch2(String[] worte){
        for(int i = 0; i < worte.length; ++i){
        this.woerterbucheintraege.put(worte[i], new Woerterbucheintrag(worte[i],1));
        }
        
    }
    
    public Woerterbucheintrag suchen(String wort){
        Woerterbucheintrag result = null;
        if(woerterbucheintraege.containsKey(wort)){
            result = woerterbucheintraege.get(wort);
        }
    
    
        return result;
    }
    
    public void einfuegen(String wort){
        if(woerterbucheintraege.containsKey(wort)){
            woerterbucheintraege.get(wort).setHaeufigkeit();
        } else{
            woerterbucheintraege.put(wort, new Woerterbucheintrag(wort,1));
        }
        
    }
    public void loeschen (String wort){
        woerterbucheintraege.remove(wort);
    }
    public void print(){
        System.out.println(Arrays.toString(woerterbucheintraege.values().toArray()));
        
    }
    
}