package ex3;

public class SavaneAfricaine  extends AbstractZone{
	
	public SavaneAfricaine() {
		super();
	}

	public double calculerKgsNourritureParJour(){
		return countAnimals() * 10;
	}

	@Override
	public boolean acceptAnimal(Animal animal) {
		if (animal.getType().equals(AnimalType.MAMMIFERE) && animal.getComportement().equals(AnimalBehavior.HERBIVORE)){
			return true;
		}
		return false;
	}
}
