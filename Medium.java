package bibliothekdrei;

import java.util.ArrayList;
import java.util.List;

public class Medium {

	protected String id;
	protected String titel;
	protected int jahr;
	protected Datum bestandsaufnahme;
	protected int ausleihen;
	private String[] worte;
	
	public Medium(String id, String titel, int jahr, Datum bestandsaufnahme, int ausleihen){
		this.id = id;
		this.titel = titel;
		this.jahr = jahr;
		this.bestandsaufnahme = bestandsaufnahme;
		this.ausleihen = ausleihen;
		worte = titel.split(" ");
		for( int i=0; i<worte.length; i++ ){
			worte[i] = worte[i].toLowerCase().replaceAll("[^A-Za-z0-9]","");
		}
	}
	
	public String getTitel(){
		return this.titel;
	}
	
	public int getJahr(){
		return this.jahr;
	}
	
	public Datum getBestandsaufnahme(){
		return this.bestandsaufnahme;
	}
	
	public String toString(){
		return this.titel+" ("+this.jahr+", "+this.ausleihen+" Mal ausgeliehen)";  
	}
	
	public int getAusleihen(){
		return this.ausleihen;
	}	
	
	public List<String> getWorte(){
		List<String> result = new ArrayList<>();
		for (int i = 0; i<this.worte.length; ++i){
			result.add(this.worte[i]);
		}
		return result;
	}
	
}