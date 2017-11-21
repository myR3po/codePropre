package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String name;
	List<AbstractZone> zones;
	
	public Zoo(String name){
		this.name = name;
		init();
	}
	
	private void init() {
		zones = new ArrayList<AbstractZone>();
		zones.add(new SavaneAfricaine());
		zones.add(new ZoneCarnivore());
		zones.add(new FermeReptile());
		zones.add(new Aquarium());
	}
	
	public void addAnimal(Animal animal){
		for(AbstractZone zone : zones) {
			if (zone.acceptAnimal(animal)){
				zone.addAnimal(animal);
				return;
			}
		}
	}
	
	public void displayAllAnimals(){
		zones.stream().forEach(AbstractZone::displayAllAnimals);
	}

	/** Getter for name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter
	 * @param name the name to set
	 */
	public void setNom(String name) {
		this.name = name;
	}
}
