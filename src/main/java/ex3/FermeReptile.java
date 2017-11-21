package ex3;

import java.util.List;

public class FermeReptile extends Zone {

	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.1;
	}
	
	public boolean verifyValiditeZone(String type, RegimeAlimentaire comportement) {
		
		if( type.equals("SERPENT") ) {
			return true;
		}
		return false;
		
	}
}
