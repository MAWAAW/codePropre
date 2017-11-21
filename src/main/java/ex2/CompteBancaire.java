/**
 * 
 */
package ex2;

/**
 * @author ETY0005
 *
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	public abstract void debiterMontant(double montant);

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
	
}
