package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggTabell;

	private int nesteLedig;

	public Blogg() {
		
		innleggTabell = new Innlegg[20];
		nesteLedig = 0;
		
	}

	public Blogg(int lengde) {
		
		innleggTabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedig; i++) {
			
			if (innleggTabell[i].equals(innlegg)) {
				return i;
			}
		} return -1;
	} 

	public boolean finnes(Innlegg innlegg) {
		
		for (int i = 0; i < nesteLedig; i++) {
			
			if (innleggTabell[i].equals(innlegg)) {
				return true;
			}
		} return false;
	}

	public boolean ledigPlass() {
		
		if(nesteLedig < innleggTabell.length) {
			return true;
		} else
			return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(finnes(innlegg)) {
			return false;
		} else {
			innleggTabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		} 
	}
	
	public String toString() {
		
		String txt = nesteLedig + "\n";
		
		for (int i = 0; i < nesteLedig; i++) {
			txt += innleggTabell[i].toString();
			
		} return txt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		if(innleggTabell.length >= nesteLedig) {
			
			Innlegg[] nyTabell = new Innlegg[innleggTabell.length * 2];
			
			for (int i = 0; i <innleggTabell.length; i++) {
				nyTabell[i] = innleggTabell[i];
			}
			 innleggTabell = nyTabell;
		}
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}