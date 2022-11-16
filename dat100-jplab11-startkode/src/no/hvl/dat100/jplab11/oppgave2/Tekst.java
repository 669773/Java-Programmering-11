package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
 
	private String tekst;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.setId(id);       this.setBruker(bruker);
		this.setDato(dato);   this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.setId(id);       this.setBruker(bruker);
		this.setDato(dato);   this.tekst = tekst;
		this.setLikes(likes);
	}
	


	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		
		String likesString = Integer.toString(getLikes());
		String idString = Integer.toString(getId());
		
		String svarTekst = "TEKST" + "\n" + idString + "\n" + getBruker() + "\n" + 
		       getDato() + "\n" + likesString + "\n" +  tekst + "\n";
		
		return svarTekst;

	}
	

}
