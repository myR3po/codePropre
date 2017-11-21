package ex3;

public enum AnimalBehavior {

	HERBIVORE("HERBIVORE"),
	CARNIVORE("CARNIVORE");
	
	private String behavior;
	
	AnimalBehavior(String behavior){
		this.behavior = behavior;
	}
	
}
