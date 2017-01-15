package bibliothekdrei;


import java.lang.Comparable;


public class Woerterbucheintrag implements Comparable <Woerterbucheintrag> {
    
    private String wort;
    private int haeufigkeit;
    
    public Woerterbucheintrag(String wort, int anzahl){
        this.wort = wort;
        this.haeufigkeit = anzahl;
    }
    @Override
    public int compareTo(Woerterbucheintrag eintrag){
        int result1 = this.wort.compareTo(eintrag.getWort());
       /* final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        int result = 0;
        
        if(this.wort.compareTo(eintrag.getWort()) < 0){
            result = AFTER;
        } else if (this.wort.compareTo(eintrag.getWort()) > 0){
            result = BEFORE;
        } else if(this.wort.compareTo(eintrag.getWort())== 0){
            result = 0;
        }*/
        return result1;
    }
    
    public String getWort(){
        return this.wort;
    }
    public int getHaeufigkeit(){
        return this.haeufigkeit;
    }
    public void setHaeufigkeit(){
        ++this.haeufigkeit;
    }
    public String toString(){
        return "Wort: " +this.wort+ "Anzahl: " + this.haeufigkeit;
    }
}