/**
 * Exemple sur les variables
 */

package com.bigcorp.formation.cours;

// Classe principale
public class InstanciationsDeClasse {
	public static void main(String[] args) {
		// Définition d'une variable de type Object
		Object monObjet;
		
		// Instanciation d'un Object.
		monObjet = new Object();
		
		//Définition et instanciation 
		Object monObjet2 = new Object();
		monObjet2 = null;
		
		//Définitions de chaînes de caractères
		String maChaine = new String("coucou");
		System.out.println(maChaine);
		String maChaineEnMajuscules =  maChaine.toUpperCase();
		System.out.println(maChaineEnMajuscules);
		
		//Concaténation de chaînes de caractères
		String concatenee = "salut " + "les copains !";
		

	}
}