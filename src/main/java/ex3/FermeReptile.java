package ex3;

public class FermeReptile extends AbstractZone{
	
	public FermeReptile() {
		super();
	}
	
	public double calculerKgsNourritureParJour(){
		return countAnimals() * 0.1;
	}

	@Override
	public boolean acceptAnimal(Animal animal) {
		 if (animal.getType().equals(AnimalType.REPTILE)) {
			 return true;
		 }
		return false;
	}
}
