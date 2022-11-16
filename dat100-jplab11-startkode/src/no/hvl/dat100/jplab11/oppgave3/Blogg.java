package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	private innlegg []innleggTab;
	private int nesteLedige;
	
	public Blogg() {
		innleggTab = new Innlegg [20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggTab = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return innleggTab; 
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i > nesteLedig; i++)
		      if(innlegg.erLik(innleggTab[i])) {
			       return i;
		//throw new UnsupportedOperationException(TODO.method());
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int i = 0;

		while (i < nesteLedig && !funnet) {
			if(innlegg.getId() == innleggTab[i].getId()) {
				funnet = true;

			}
			i++;
		}
		return funnet;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		
		if (nesteLedig == innleggTab.lenght) {
			ledig = false;
		}
		return ledig;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if(!finnes(innlegg)) {
			innleggTab[nesteLedig] = innlegg;
			lagtTil = true;
			nesteLedig++;
		}
		return lagtTil;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		String a = "";
		for(int i = 0; i < nesteLedig; i++) {
			a += innleggTab[i].toString();
		}
		return nesteLedig + "\n" + a;
		//throw new UnsupportedOperationException(TODO.method());
	}	
}
