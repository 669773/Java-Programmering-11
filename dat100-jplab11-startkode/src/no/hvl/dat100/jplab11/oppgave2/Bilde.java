package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.setId(id);       this.setBruker(bruker);
		this.setDato(dato);   this.setTekst(tekst);
		this.url  = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.setId(id);       this.setBruker(bruker);
		this.setDato(dato);   this.setTekst(tekst);
		this.url  = url;      this.setLikes(likes);
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {

		String likesString = Integer.toString(getLikes());
		String idString = Integer.toString(getId());
		
		String svarBilde = "BILDE" + "\n" + idString + "\n" + getBruker()+ "\n" + 
		       getDato() + "\n" + likesString + "\n" + getTekst() + "\n"+ url + "\n";
		
		return svarBilde;
	}

	/* Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}*/
}
