package ex3;

public class ZooApplication {

	/*
	 * les classes FermeReptile, SavaneAfricaine, ZoneCarnivore, Aquarium ne sont pas instanciées.
	 * Les listes dans les différentes classes citées ci-dessous ne sont pas instanciées.
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", AnimalType.MAMMIFERE, AnimalBehavior.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", AnimalType.MAMMIFERE, AnimalBehavior.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalType.MAMMIFERE, AnimalBehavior.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", AnimalType.MAMMIFERE, AnimalBehavior.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", AnimalType.POISSON, AnimalBehavior.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", AnimalType.POISSON, AnimalBehavior.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, AnimalBehavior.CARNIVORE));
		zoo.addAnimal(new Animal("Python", AnimalType.REPTILE, AnimalBehavior.CARNIVORE));
		zoo.displayAllAnimals();
	}

}
