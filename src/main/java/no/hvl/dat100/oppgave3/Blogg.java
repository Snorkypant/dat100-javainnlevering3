package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] samling;
	int amount;


	public Blogg() {

		this.samling = new Innlegg[20];
		this.amount = 0;
	}

	public Blogg(int lengde) {

		this.samling = new Innlegg[lengde];
		this.amount = 0;
	}

	public int getAntall() {

		return amount;
	}
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int id = innlegg.getId();
		for(int i = 0;i<amount;i++){
			if (samling[i].getId() == id){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if(finnInnlegg(innlegg) >= 0){
			return true;
		} else{
			return false;
		}
	}

	public boolean ledigPlass() {
		if (getAntall() < samling.length){
			return true;
		} else{
			return false;
		}

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()) {
			if (!finnes(innlegg)) {
				samling[amount] = innlegg;
				amount ++;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String returnString = "";
		returnString += getAntall()+"\n";
		for(int i = 0; i<getAntall();i++){
			returnString += samling[i].toString();
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
