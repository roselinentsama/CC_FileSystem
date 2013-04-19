package fileSys;

/*
 * Auteur : Roseline et Amine
 */
import fileSysTest.repertoireException;

import java.util.ArrayList;

public class REPERTOIRE extends RACINE {
	
	private ArrayList <RACINE> doc = new ArrayList<RACINE>();

	public REPERTOIRE(String nom) {
		super(nom);
		
	}

public void Ajouter(RACINE f){
	if(f==null)throw new repertoireException("on ne peut pas ajouter une référence nulle dans un repertoire");
	System.out.println("erreur,il faut saisir une référence");
	for(RACINE r : doc)
	{
		if(r.getNom().equals(f.getNom()))throw new repertoireException("on ne peut pas ajouter une rŽference de meme nom");
		System.out.println("erreur,d'ajout");
			
	}
	if(this.equals(f))throw new repertoireException("on ne peut pas ajouter un repertoire dans un repertoire");
	
	doc.add(f);
}

	
	@Override
	public void ouvrir() {
		System.out.println("\n Nom du repertoire :" + super.getNom()  +   " ; Nom de la référence : " + this.doc);
		
		
	}

	@Override
	public int Taille() {
		int taille=1;
		if(taille==0)throw new repertoireException("erreur sur le calcul de la taille");
		{System.out.println("erreur la taille ne peut pas etre 0");}
		if(taille<0)throw new repertoireException("erreur sur le calcul de la taille");
		{System.out.println("erreur la taille ne peut pas etre nŽgatif");}
		
		for (RACINE r : doc){
			taille+=r.Taille();
		System.out.println("\n la taille est :" +taille);
		}
		
		return taille;
		
	}
	
	

}
