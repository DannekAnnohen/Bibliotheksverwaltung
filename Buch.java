package bibliothekdrei;

public class Buch extends Medium {

	private String autor;
	private String isbn;
	private int seiten;
	
	public Buch(String id, String titel, int jahr, Datum bestandsaufnahme, int ausleihen, String autor, String isbn, int seiten) {
		super(id, titel, jahr, bestandsaufnahme, ausleihen);
		this.autor = autor;
		this.isbn = isbn;
		this.seiten = seiten;
	}

	public String getAutor(){
		return this.autor;
	}
	
	public int getSeiten(){
		return this.seiten;
	}
	
	public String getISBN(){
		return this.isbn;
	}
	
	public String toString(){
		return super.toString() + " (Buch, "+this.isbn+", Autor: "+this.autor+", Seiten: "+this.seiten+")";  
	}

}