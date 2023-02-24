
package com.bigcorp.formation.exercices;

public class ExerciceWrappers {
	public static void main(String[] args) {

		int monInt = 4;
		Integer monInstanceDeIntMieux = Integer.valueOf(4);
		byte conversionEnByte = monInstanceDeIntMieux.byteValue();

		// Boxing d'un int
		Integer monNouvelInt = 5;

		// Boxing d'un boolean (true) en Boolean
		Boolean monBooleen = true;
		Double pi = 3.14;

		int somme = monInstanceDeIntMieux + monNouvelInt;
		System.out.println("La sommme vaut : " + somme);

		// Création d'un int à partir d'une chaîne de caractères
		int maValeur = Integer.parseInt("43");

		// Passage de ce int en Integer
		Integer maValeurAsInteger = maValeur;

	}
}