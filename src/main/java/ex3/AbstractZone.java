package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractZone {
	private List<Animal> animals;

	public AbstractZone() {
		this.animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public abstract boolean acceptAnimal(Animal animal);
	
	public void displayAllAnimals(){
		animals.stream().forEach(System.out::println);
	}
	
	public int countAnimals(){
		return getAnimals().size();
	}
	
	public abstract double calculerKgsNourritureParJour();

	public List<Animal> getAnimals() {
		return animals;
	}

}