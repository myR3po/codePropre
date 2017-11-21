package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
			
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected TypeCompteBancaire type;

	/** Ce constructeur est utilisé pour créer un compte bancaire
	 * @param type = LIVRET_A ou COMPTE_COURANT
	 * @param solde représente le solde du compte
	 */
	public CompteBancaire(TypeCompteBancaire type, double solde) {
		super();
		this.type = type;
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/** Getter for type
	 * @return the type
	 */
	public TypeCompteBancaire getType() {
		return type;
	}
}
