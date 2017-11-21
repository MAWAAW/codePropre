/**
 * 
 */
package ex3;

/**
 * @author ETY0005
 *
 */
public class Animal {

	
	/**
	 * Constructeur
	 * nom: nom
	 * type: type
	 * comportement: régime alimentaire
	 */
	private String nom, type;
	private RegimeAlimentaire comportement;

	public Animal(String nom, String type, RegimeAlimentaire comportement) {
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", type=" + type + ", comportement=" + comportement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RegimeAlimentaire getComportement() {
		return comportement;
	}

	public void setComportement(RegimeAlimentaire comportement) {
		this.comportement = comportement;
	}

}
