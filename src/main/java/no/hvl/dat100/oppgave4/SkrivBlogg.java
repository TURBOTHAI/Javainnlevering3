package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
	

	public static boolean skriv(Blogg samling, String mappe, String filnavn)  {
		
//		File nyFil = new File(mappe,filnavn);
//		
//		PrintWriter navn1 = new PrintWriter(nyFil);
//		
//		navn1.println(samling.toString());
//		
//		navn1.close();
//		
//		return true; }}
		
        File fil = new File(mappe,filnavn);

        try (PrintWriter writer = new PrintWriter(fil)) {
       
            writer.print(samling.toString());
            return true;
            
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finne eller opprette filen: " + e.getMessage());
            return false;
        }
    }
}