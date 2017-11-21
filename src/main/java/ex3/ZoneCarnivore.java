package ex3;

import java.util.List;

public class ZoneCarnivore extends Zone {
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
	
	public boolean verifyValiditeZone(String type, RegimeAlimentaire comportement) {
		
		if( type.equals("CARNIVORE") && comportement.equals(RegimeAlimentaire.CARNIVORE) ) {
			return true;
		}
		return false;
		
	}
}
