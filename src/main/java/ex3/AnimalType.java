package ex3;

public enum AnimalType {
	MAMMIFERE("MAMMIFERE"),
	REPTILE("REPTILE"),
	POISSON("POISSON");
	
	private String type;

	private AnimalType(String type) {
		this.type = type;
	}
	
}
