package ex3;

import java.util.*;

public class Zoo {

	private String nom;
	List<Zone> zones = new ArrayList<>();
	
	public Zoo(String nom) {
		this.nom = nom;
		zones.add(new SavaneAfricaine());
		zones.add(new FermeReptile());
		zones.add(new Aquarium());
		zones.add(new ZoneCarnivore());
	}
	
	public void addAnimal(String nom, String type, RegimeAlimentaire comportement) {

		for( Zone z: zones ) {
			if( z.verifyValiditeZone(type,comportement) ) {
				z.addAnimal(new Animal(nom, type, comportement));
			}
		}
		
	}
	
	public void afficherAnimaux() {
		for(Zone z: zones) {
			z.afficherAnimaux();
		}
	}



}
