package ex3;

public class Aquarium extends AbstractZone {

	public Aquarium() {
		super();
	}
		
	public double calculerKgsNourritureParJour(){
		return countAnimals() * 0.2;
	}

	@Override
	public boolean acceptAnimal(Animal animal) {
		if (animal.getType().equals(AnimalType.POISSON)){
			return true;
		}
		return false;
	}
}
