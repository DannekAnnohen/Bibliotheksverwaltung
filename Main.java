package bibliothekdrei;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.lang.Comparable;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Bibliothek bib = new Bibliothek();
		String[][] medien = BibliothekDB.getMedien();
		for( int i=0; i<medien.length; i++ ){
			String[] m = medien[i];
			String id = m[1];
			String titel = m[2];
			int jahr = Integer.parseInt(m[3]);
			int ausleihen = Integer.parseInt(m[7]);
			Datum datum = new Datum(Integer.parseInt(m[4]),Integer.parseInt(m[5]),Integer.parseInt(m[6]));
			if( m[0] == "CD" ){
				String interpret = m[8];
				int laufzeit = Integer.parseInt(m[9]);				
				int numtitel = Integer.parseInt(m[10]);
				bib.addMedium(new CD(id,titel,jahr,datum,ausleihen,interpret,numtitel,laufzeit));
			}
			else if( m[0] == "Film" ){
				String format = m[8];
				String genre = m[9];
				String regie = m[10];
				bib.addMedium(new Film(id,titel,jahr,datum,ausleihen,format,regie,genre));
			}
			else if( m[0] == "Buch" ){
				String autor = m[10];
				String isbn = m[8];
				int seiten = Integer.parseInt(m[9]);
				bib.addMedium(new Buch(id,titel,jahr,datum,ausleihen,autor,isbn,seiten));
			}
		}		

		// Liste der Medien in der Bibliothek
		ArrayList<Medium> medienliste = bib.getMedien();

		// Liste der (englischen) Stoppworte
		HashSet<String> stoppworte = BibliothekDB.getStoppworte();
                
                StringBuilder woerter = new StringBuilder();
                for(int k = 0; k < medienliste.size(); ++k){
                    woerter.append(medienliste.get(k).getWorte());
                }
                String[] allewoerter = woerter.toString().split(" ");
               
                long startTimeErstesBuch = System.currentTimeMillis();
                Woerterbuch1 erstesbuch = new Woerterbuch1(allewoerter);
                long stopTimeErstesBuch = System.currentTimeMillis();
                
                long startTimeZweitesBuch = System.currentTimeMillis();
		Woerterbuch2 zweitesbuch = new Woerterbuch2(allewoerter);
                long stopTimeZweitesBuch = System.currentTimeMillis();
                
                long startTimeDrittesBuch = System.currentTimeMillis();
                Woerterbuch3 drittesbuch = new Woerterbuch3(allewoerter);
                long stopTimeDrittesBuch = System.currentTimeMillis();
                
                long elapsedTimeErstesBuch = stopTimeErstesBuch - startTimeErstesBuch;
                long elapsedTimeZweitesBuch = stopTimeZweitesBuch - startTimeZweitesBuch;
                long elapsedTimeDrittesBuch = stopTimeDrittesBuch - startTimeDrittesBuch;
                
                System.out.println("Dauer erstellen erstesbuch: " + elapsedTimeErstesBuch + " Millisekunden");
                System.out.println("Dauer erstellen zweitesbuch: " +elapsedTimeZweitesBuch + " Millisekunden");
                System.out.println("Dauer erstellen drittesbuch: " +elapsedTimeDrittesBuch + " Millisekunden");
                
                long startTimeLoeschen1 = 0;
                long stopTimeLoeschen1 = 0;
                long startTimeLoeschen2 = 0;
                long stopTimeLoeschen2 =  0;
                long startTimeLoeschen3 = 0;
                long stopTimeLoeschen3 = 0;
                
                Iterator iteratorStoppworte = stoppworte.iterator();
                
                startTimeLoeschen1 = System.currentTimeMillis();                
                while (iteratorStoppworte.hasNext()){
                    
                    erstesbuch.loeschen((String) iteratorStoppworte.next());
                    
                }
                stopTimeLoeschen1 = System.currentTimeMillis();
                
                startTimeLoeschen2 = System.currentTimeMillis();
                while(iteratorStoppworte.hasNext()){    
                    
                    zweitesbuch.loeschen((String) iteratorStoppworte.next());
                    
                }
                stopTimeLoeschen2 = System.currentTimeMillis();
                
                startTimeLoeschen3 = System.currentTimeMillis();
                while(iteratorStoppworte.hasNext()){    
                    
                    drittesbuch.loeschen((String) iteratorStoppworte.next());
                    
                }
                stopTimeLoeschen3 = System.currentTimeMillis();
                
                long elapsedTimeLoeschen1 = stopTimeLoeschen1 - startTimeLoeschen1;
                long elapsedTimeLoeschen2 = stopTimeLoeschen2 - startTimeLoeschen2;
                long elapsedTimeLoeschen3 = stopTimeLoeschen3 - startTimeLoeschen3;
                
                System.out.println("Dauer loeschen der Stoppworte aus erstesbuch: " + elapsedTimeLoeschen1 + " Millisekunden");
                System.out.println("Dauer loeschen der Stoppworte aus zweitesbuch: " + elapsedTimeLoeschen2 + " Millisekunden");
                System.out.println("Dauer loeschen der Stoppworte aus drittessbuch: " + elapsedTimeLoeschen3 + " Millisekunden");
               
	
                /*Woerterbucheintrag test1 = new Woerterbucheintrag ("Hallo", 1);
                Woerterbucheintrag test2 = new Woerterbucheintrag ("Tschuss", 1);
                Woerterbucheintrag test3 = new Woerterbucheintrag ("balsam", 1);
                TreeSet<Woerterbucheintrag> eintrage = new TreeSet<>();
                eintrage.add(test1);
                eintrage.add(test2);
                eintrage.add(test3);
                
                System.out.println(" " + eintrage.contains(new Woerterbucheintrag("Hallo",1)));*/
                System.out.println(" " + zweitesbuch);


        }

}