package fileSys;

/*
 * Auteur : Roseline et Amine
 * RACINE est une classe qui comporte les methodes abstraites
 */


public abstract class RACINE {

	 private String nom;

	public RACINE(String nom) {
		
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	public abstract void ouvrir();
	public abstract int Taille();
	 
}
