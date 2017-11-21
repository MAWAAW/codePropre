package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	
	List<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public abstract double calculerKgsNourritureParJour();
	public abstract boolean verifyValiditeZone(String type, RegimeAlimentaire comportement);

	public void afficherAnimaux() {
		for(Animal a: animals) {
			System.out.println(a);
		}
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}	
}
