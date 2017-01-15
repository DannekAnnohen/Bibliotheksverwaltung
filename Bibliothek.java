package bibliothekdrei;



import java.util.ArrayList;

public class Bibliothek {

	private ArrayList<Medium> medien;
        private Woerterbuch2 woerterbuch;
        
        /* Ich weise der Variable woerterbuch den Woerterbuchtyp 2 (HashMap) zu,
        da dieser in meiner Laufzeitanalyse die kleinsten Werte für die Konstruktion
        sowie der Methode loeschen hatte.
        */
	
	public Bibliothek(){
		this.medien = new ArrayList<Medium>();
                
                
	}
	
	public ArrayList<Medium> getMedien(){
		return this.medien;
	}
	
	public void addMedium(Medium m){
		this.medien.add(m);
	}

}