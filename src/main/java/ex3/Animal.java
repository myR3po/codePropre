package ex3;

/**
 * Cette classe represente un animal
 * 
 * @author myR3po
 *
 */
public class Animal {


	private String name;
	private AnimalType type;
	private AnimalBehavior comportement;
	
	public Animal(String name, AnimalType type, AnimalBehavior comportement) {
		super();
		this.type = type;
		this.name = name;
		this.comportement = comportement;
	}

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnimalBehavior getComportement() {
		return comportement;
	}

	public void setComportement(AnimalBehavior comportement) {
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type.name() + ", comportement=" + comportement + "]";
	}
	
	

}
