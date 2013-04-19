package fileSys;

/*
 * Auteur : Roseline et Amine
 */


public class FICHIER extends RACINE {
	
	private int taille = 0;

	public int getTaille() {
		return taille;
	}

	public FICHIER(String nom, int taille) {
		super(nom);
		this.taille = taille;
	}

	@Override
	public void ouvrir() {
		System.out.println("\n Nom du fichier :" + super.getNom() + " Taille du fichier : " + this.taille);
		
	}

	@Override
	public int Taille() {
		return taille;
	}
	
	

}
