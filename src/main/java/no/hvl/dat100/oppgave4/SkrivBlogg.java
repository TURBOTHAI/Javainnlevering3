package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
	
	//Brukte hjelp fra chattGPT

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
        File fil = new File(mappe, filnavn);

        try (PrintWriter writer = new PrintWriter(fil)) {
       
            writer.print(samling.toString());
            return true;
            
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finne eller opprette filen: " + e.getMessage());
            return false;
        }
    }
}
