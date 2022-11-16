package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.setId(id);     this.bruker = bruker;
		this.dato = dato; this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.setId(id);     this.bruker = bruker;
		this.dato = dato; this.likes = likes;	
	}
	
	public String getBruker() {	
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {	
		likes = getLikes() + 1;
	}
	
	/*public boolean erLik(Innlegg innlegg) {
		if(innlegg(id)== id){
			return true;
		}

	}*/
	
	@Override
	public String toString() {
		
		String newLine = System.getProperty("line.separator");
		String idString = Integer.toString(getId());
		String likesString = Integer.toString(likes);
		
		String svar = idString + newLine + bruker + newLine + dato + newLine + likesString + newLine;
		return svar;
				
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
}
