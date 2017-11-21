package ex1;

/**
 * Cette classe represente un objet Calcul
 * 
 * Elle permet de faire soit l'addition soit la soustraction entre de nombres
 * 
 * @author myR3po
 *
 */
public class Calcul {

	/**
	 * Cette méthode permet d'additionner deux nombres 
	 * 
	 * @param nombre1
	 * @param nombre2
	 * @return le resultat de l'addition
	 */
	public int additionner(int nombre1, int nombre2){
		return nombre1 + nombre2;
	}
	
	/**
	 * Cette méthode permet de soustraire deux nombres 
	 * 
	 * @param nombre1
	 * @param nombre2
	 * @return le resultat de la soustraction
	 */
	public int soustraire(int nombre1, int nombre2){
		return nombre1 - nombre2;
	}
}
