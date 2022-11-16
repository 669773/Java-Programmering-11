package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private Innlegg []innleggTab;
	private int nesteLedige;
	
	public Blogg() {
		innleggTab = new Innlegg [20];
		nesteLedige = 0;
	}

	public Blogg(int lengde) {
		innleggTab = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	
	}
	
	public Innlegg[] getSamling() {
		return innleggTab; 
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i > nesteLedige; i++)
		      if(innlegg.erLik(innleggTab[i])) {
			       return i;
		      }
		return -1;
	}
	

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int i = 0;

		while (i < nesteLedige && !funnet) {
			if(innlegg.getId() == innleggTab[i].getId()) {
				funnet = true;

			}
			i++;
		}
		return funnet;
	
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		
		if (nesteLedige == innleggTab.length) {
			ledig = false;
		}
		return ledig;
	

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if(!finnes(innlegg)) {
			innleggTab[nesteLedige] = innlegg;
			lagtTil = true;
			nesteLedige++;
		}
		return lagtTil;
	
	}
	
	public String toString() {
		String a = "";
		for(int i = 0; i < nesteLedige; i++) {
			a += innleggTab[i].toString();
		}
		return nesteLedige + "\n" + a;

	}	
}
