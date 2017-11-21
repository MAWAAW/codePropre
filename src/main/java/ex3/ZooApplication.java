package ex3;

public class ZooApplication {


	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", "MAMMIFERE", RegimeAlimentaire.HERBIVORE);
		zoo.addAnimal("Zèbre", "MAMIFERE", RegimeAlimentaire.HERBIVORE);
		zoo.addAnimal("Lion", "MAMMIFERE", RegimeAlimentaire.HERBIVORE);
		zoo.addAnimal("Panthère", "MAMMIFERE", RegimeAlimentaire.CARNIVORE);
		zoo.addAnimal("Requin blanc", "POISSON", RegimeAlimentaire.HERBIVORE);
		zoo.addAnimal("Truite dorée", "POISSON", RegimeAlimentaire.HERBIVORE);
		zoo.addAnimal("Boa constrictor", "SERPENT", RegimeAlimentaire.CARNIVORE);
		zoo.addAnimal("Python", "SERPENT", RegimeAlimentaire.CARNIVORE);

		zoo.afficherAnimaux();
		
	}

}
