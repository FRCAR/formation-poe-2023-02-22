
package com.bigcorp.formation.exercices;

import com.bigcorp.formation.tp.animal.Animal;

public class ExerciceWrappers {
	public static void main(String[] args) {

		int monInt = 4;
		int somme = 4 + 7 * 8;

		Integer monInteger = Integer.valueOf(4);
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();

		int sommeDesDeuxAnimaux = 
			animal1.getMasse().intValue() + animal2.getMasse().intValue();

		int sommeDesDeuxAnimauxAvecUnboxing = 
			animal1.getMasse() + animal2.getMasse();

		int monPoidsAUnCertainAge = 42;
		
		//sans autoboxing
		animal2.setMasse(Integer.valueOf(monPoidsAUnCertainAge));
		//avec autoboxing
		animal2.setMasse(monPoidsAUnCertainAge);


		// Boxing d'un int
		Integer monNouvelInt = 5;

		// Boxing d'un boolean (true) en Boolean
		Boolean monBooleen = true;
		Double pi = 3.14;

		// Création d'un int à partir d'une chaîne de caractères
		int maValeur = Integer.parseInt("43");

		// Passage de ce int en Integer
		Integer maValeurAsInteger = maValeur;

	}
}