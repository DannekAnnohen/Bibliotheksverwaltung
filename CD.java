package bibliothekdrei;

public class CD extends Medium {

	private String interpret;
	private int numtitel;
	private int laufzeit;
	
	public CD(String id, String titel, int jahr, Datum bestandsaufnahme, int ausleihen, String interpret, int numtitel, int laufzeit) {
		super(id, titel, jahr, bestandsaufnahme, ausleihen);
		this.numtitel = numtitel;
		this.laufzeit = laufzeit;
		this.interpret = interpret;
	}

	public int getNumTitel(){
		return this.numtitel;
	}
	
	public int getLaufzeit(){
		return this.laufzeit;
	}
	
	public String getInterpret(){
		return this.interpret;
	}
	
	public String toString(){
		return super.toString() + " (CD, Interpret: "+this.interpret+", "+this.numtitel+" Titel, Laufzeit: "+this.laufzeit+")";  
	}

}