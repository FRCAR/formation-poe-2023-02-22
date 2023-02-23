/**
 * Exemple sur les variables
 */

package com.bigcorp.formation.cours;

// Classe principale
public class VariablesSimples {
	public static void main(String[] args) {

		// Définition d'un int
		int monPremierInt;

		// Assignation d'une valeur à l'int précédemment vu
		monPremierInt = 13;

		// Définition et assignation en une ligne
		int monDeuxiemeInt = 34;

		// Idem pour un float et un booléen
		float monPremierFloat = 3.14f;
		boolean monPremierBooleen = false;

		// Affectation multiple
		// Moche, à éviter
		int a, b, c = b = a = 3;

		// Operateur arithmetique simple avec définition
		int somme = a + b;
		int fonction = 3 * (a + b);

		// Operateur unitaire postfixe
		somme++;
		// Le code ci-dessus est équivalent à somme = somme + 1 ;

		// Operateur unitaire prefixe
		int maValeur = ++somme;
		maValeur = somme++;

		// Operateur binaire

		// Operateur de comparaison logique
		boolean jeSuisPlusGrandQueRoger = false;
		int maTaille = 180;
		int tailleDeRoger = 194;
		jeSuisPlusGrandQueRoger = maTaille > tailleDeRoger;
		boolean rogerEstPlusGrandQueSimone = true;
		boolean jeSuisPlusGrandQueSimone = jeSuisPlusGrandQueRoger && rogerEstPlusGrandQueSimone;

		boolean ilFaitBeau = true;
		boolean jAiUneVoiture = true;
		boolean jeVaisALaPlage = ilFaitBeau || jAiUneVoiture;

		// Operateur de negation
		boolean jeNeVaisALaPlage = !jeVaisALaPlage;
		boolean monVoisinEstALaPlage = true;
		boolean jeVaisALaPlageEnPrenantEnCompteLeVoisin = ilFaitBeau && !monVoisinEstALaPlage;

		// L'opérateur ternaire
		String message = jeVaisALaPlage ? "super !" : "nooon!";
		boolean jePeuxSansDoutePartirALaPlage = monVoisinEstALaPlage || ilFaitBeau;
		int carburant = jeVaisALaPlage && jePeuxSansDoutePartirALaPlage ? 3 * 4 + a : somme++;

		// conversion de double vers float
		float monFloat = 3f;
		double monDouble = monFloat;

		monFloat = (float) monDouble;

		byte b1 = 3;
		short s1 = 5;
		int i1 = 7;
		long l1 = 5;

		l1 = b1;
		b1 = (byte) l1;
       
		//La ligne ci-dessous ne fonctionne pas : mot réservé
       //byte byte = 3;
	}

	private static boolean calculeTaille() {
		return false;
	}
}