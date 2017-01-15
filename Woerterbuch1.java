package bibliothekdrei;
import java.util.ArrayList;


public class Woerterbuch1  implements Woerterbuch {
    
    private ArrayList<Woerterbucheintrag> woerterbucheintraege = new ArrayList<>();
    
    public Woerterbuch1(String[] worte){
        for(int i  = 0; i < worte.length;++i){
        woerterbucheintraege.add(new Woerterbucheintrag(worte[i], 1));
    }}
    
    public Woerterbucheintrag suchen(String wort){
        Woerterbucheintrag result = null;
        for(int i = 0; i < woerterbucheintraege.size(); ++i){
            if(woerterbucheintraege.get(i).getWort().equals(wort)){
                result = woerterbucheintraege.get(i);
                break;
                
            }
        }
        return result;
    }
    
    public void einfuegen(String wort){
        /*for (int i = 0; i < woerterbucheintraege.size(); ++i){
        if(wort.equals(woerterbucheintraege.get(i).getWort())){
            woerterbucheintraege.get(i).setHaeufigkeit();
        } else{
            woerterbucheintraege.add(new Woerterbucheintrag(wort,1));
            break;
        }
            }*/
        
            int i = 0;
            boolean runner = false;
            for (i = 0; i< woerterbucheintraege.size(); ++i){
                if (woerterbucheintraege.get(i).getWort().equals(wort)){
                    woerterbucheintraege.get(i).setHaeufigkeit();
                    runner = true; break;
                } 
            } if (runner = false && i == 0){
                woerterbucheintraege.add(new Woerterbucheintrag(wort,1));
            }
        }
    
    public void loeschen (String wort) {
        for(int i= 0; i < woerterbucheintraege.size(); ++i){
            if(woerterbucheintraege.get(i).getWort().equals(wort)){
                woerterbucheintraege.remove(woerterbucheintraege.get(i));
            }
        }
    }
    public void print(){
        System.out.println(" " + woerterbucheintraege);
    }
}