package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
	
	//Brukte chattGPT

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        // Opprett mappen hvis den ikke eksisterer
        File katalog = new File(mappe);
        if (!katalog.exists()) {
            katalog.mkdirs();
        }

        // Opprett en fil-referanse
        File fil = new File(katalog, filnavn);

        try (PrintWriter writer = new PrintWriter(fil)) {
        	
            // Skriv hele innholdet av Blogg-samlingen til filen ved å bruke toString
            writer.print(samling.toString());
            return true; // Returner true hvis filskrivingen er vellykket
            
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finne eller opprette filen: " + e.getMessage());
            return false; // Returner false hvis en feil oppsto
        }
    }
}
