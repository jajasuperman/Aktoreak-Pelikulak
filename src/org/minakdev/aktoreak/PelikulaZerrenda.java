package org.minakdev.aktoreak;

import java.util.ArrayList;
import java.util.Iterator;

public class PelikulaZerrenda {
	
	private ArrayList<Pelikula> pelikulaZerrenda = new ArrayList<>();

	public void aktoreaEzabatu(Aktorea aktorea) {
		Iterator<Pelikula> itr=this.getIteradorea();
		while(itr.hasNext()){
			itr.next().aktoreaEzabatu(aktorea);
		}
	}
	
	public void pelikulaBilatu() {
		
	}
	
	public void sartuPelikula(Pelikula pPelikula) {
		pelikulaZerrenda.add(pPelikula);
	}
	
	public Iterator<Pelikula> getIteradorea(){
		return this.pelikulaZerrenda.iterator();
	}
	
	public Pelikula pelikulaBueltatu(String izena){
		Iterator<Pelikula> itr = this.getIteradorea();
		Pelikula peli = null;
		Pelikula momentPeli = null;
		while (itr.hasNext() && peli == null){
			momentPeli = itr.next();
			if( momentPeli.getIzena().equals(izena)){
				peli = momentPeli;
			}
		}
		return peli;
	}
}
