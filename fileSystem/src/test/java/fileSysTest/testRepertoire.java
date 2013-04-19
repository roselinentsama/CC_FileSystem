package fileSysTest;

/*
 * Auteur : Roseline et Amine
 * cette classe est une classe de test qui permet de v�rifier toutes
 * les fonctionnalit�s de la classe repertoire.
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fileSys.FICHIER;
import fileSys.RACINE;
import fileSys.REPERTOIRE;




public class testRepertoire {

	@Before
	public void setUp() throws Exception {
		REPERTOIRE rep = new REPERTOIRE("reper");
	}
     /* 
      * le test d'initialiation
      */
	@Test
	public void testIntialisation() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		assertTrue(rep.getNom()=="reper");
	}
	
	@Test
	public void testIntialisationfichier() {
		FICHIER fiche = new FICHIER("fiche", 5);
		assertTrue(fiche.getNom()=="fiche");
		assertTrue(fiche.getTaille()==5);
	}
	
	/*
	 * v�rification si le fichier a �t� bien ajout�
	 */
	@Test
	public void testAjoutFichier() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		FICHIER fiche = new FICHIER("fiche", 5);
		rep.AjouterFichier(fiche);
		assertNotNull(fiche);
	}
	/*
	 * v�rification si le repertoire a �t� bien ajout�
	 */
	@Test
	public void testAjoutRepertoire() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		REPERTOIRE rep1 = new REPERTOIRE("repertoire");
		rep.AjouterRepertoire(rep1);
		assertNotSame(rep, rep1);
		
		}
	/*
	 * V�rification de la taille du repertoire
	 */
	@Test
	public void testTaille() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		FICHIER fiche = new FICHIER("fiche", 5);
		rep.AjouterFichier(fiche);
		rep.Taille();
		
	}
	
	/*
	 * ce test l�ve une exception si l'utilisateur ajoute un repertoire de m�me dans le repertoire
	 */
	@Test(expected=repertoireException.class)
	public void testAjoutMemeRepertoire() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		rep.AjouterRepertoire(rep);
		assertSame(rep, rep);
			
	}
	
	/*
	 * ce test l�ve une exception si l'utilisateur ajoute une reference de meme nom dans un repertoire
	 */
	
	@Test(expected=repertoireException.class)
	public void testAjoutMemeFichier() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.AjouterFichier(fiche);
		rep.AjouterFichier(fiche);
		assertSame(fiche, fiche);
			
		
	}
	
	/*
	 * ce test l�ve une exception parce qu'on ne peut pas ajouter une r�f�rence nulle dans un repertoire
	 */
	
	@Test(expected=repertoireException.class)
	public void testAjoutReferenceNull() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.AjouterFichier(fiche);
		assertNull(fiche);
		
			
		
	}
	
	@Test(expected=repertoireException.class)
	public void testtailleNull() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.AjouterFichier(fiche);
		
		rep.Taille();
		assertTrue(rep.Taille()==0);
		
				
		
	}
	
	@Test(expected=repertoireException.class)
	public void testtailleNegatif() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.AjouterFichier(fiche);
		
		rep.Taille();
		assertTrue(rep.Taille()<0);
		
	}	
	
	@Test
	public void testOuvrirRepertoire() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		FICHIER fiche = new FICHIER("fiche", 5);
		rep.AjouterFichier(fiche);
		rep.ouvrir();
		assertNotNull(fiche);
	}

}
