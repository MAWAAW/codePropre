package ex3;

import java.util.List;

public class Aquarium extends Zone {

	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.2;
	}
	
	public boolean verifyValiditeZone(String type, RegimeAlimentaire comportement) {
		
		if( type.equals("POISSON") ) {
			return true;
		}
		return false;
		
	}
}
