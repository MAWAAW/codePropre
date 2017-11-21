package ex3;

import java.util.List;

public class SavaneAfricaine extends Zone {

	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
	
	public boolean verifyValiditeZone(String type, RegimeAlimentaire comportement) {
		
		if( type.equals("MAMMIFERE") && comportement.equals(RegimeAlimentaire.HERBIVORE) ) {
			return true;
		}
		return false;
		
	}
	
}
