package bibliothekdrei;

public class Film extends Medium {

	private String format;
	private String regie;
	private String genre;
	
	public Film(String id, String titel, int jahr, Datum bestandsaufnahme, int ausleihen, String format, String regie, String genre) {
		super(id, titel, jahr, bestandsaufnahme, ausleihen);
		this.format = format;
		this.regie = regie;
		this.genre = genre;
	}

	public String getRegie(){
		return this.regie;
	}
	
	public String getFormat(){
		return this.format;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	public String toString(){
		return super.toString() + " (Film, "+this.format+", Regie: "+this.regie+", Genre: "+this.genre+")";  
	}
	
}