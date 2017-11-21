package ex3;

public class ZoneCarnivore  extends AbstractZone {
	
	public ZoneCarnivore() {
		super();
	}
	
	public double calculerKgsNourritureParJour(){
		return countAnimals() * 10;
	}

	@Override
	public boolean acceptAnimal(Animal animal) {
		if (animal.getType().equals(AnimalType.MAMMIFERE) && animal.getComportement().equals(AnimalBehavior.CARNIVORE)){
			return true;
		}
		return false;
	}
}
