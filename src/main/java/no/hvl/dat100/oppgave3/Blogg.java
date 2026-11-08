package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] blogg;
	int amount;


	public Blogg() {
		Innlegg[] blogg = new Innlegg[20];
	}

	public Blogg(int lengde) {

		Innlegg[] blogg = new Innlegg[lengde];
	}

	public int getAntall() {
		int count= 0;
		for(Innlegg i: blogg){
			if(i != null){
				count++;
			}
		}
		return count;
	}
	
	public Innlegg[] getSamling() {
		return this.blogg;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = true;
		int i = 0;
		int id = innlegg.getId();
		while(!funnet){
			if(i <= blogg.length) {
				if (id == blogg[i].getId()) {
					funnet = true;
				} else {
					i++;
				}
			}else {return -1;}
		}
		return i;

	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg) >= 0){
			return true;
		} else{
			return false;
		}
	}

	public boolean ledigPlass() {
		if (getAntall() < blogg.length){
			return true;
		} else{
			return false;
		}

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()) {
			if (!finnes(innlegg)) {
				blogg[amount] = innlegg;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String returnString = "";
		returnString += getAntall();
		for(int i = 0; i<getAntall();i++){
			returnString += blogg[i].toString();
		}
		return returnString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
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
