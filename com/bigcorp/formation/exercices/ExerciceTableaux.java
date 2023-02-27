/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Creer un autre tableau ayant un element de plus que le premier initialisé a 0.
* 3. Afficher les elements du premier tableau.
* 4. Afficher les elements du 2eme tableau.
* 5. Copier les valeurs du premier tableau dans le second et inserer une valeur aribitraire a la 3eme position.
* 6. Afficher le tableau apres l'operation d'insertion.
*/

package com.bigcorp.formation.exercices;

import java.util.Random;

// Classe principale
public class ExerciceTableaux {
	public static void main(String[] args) {

		// L'instruction ci-dessous génère un float aléatoire de 0 à 100.
		float randomFloat = new Random().nextFloat() * 100;

		// Créer un tableau de 10 floats
		float mesFloats[] = new float[10];

		// Le remplir avec des float aléatoires
		for (int i = 0; i < mesFloats.length; i++) {
			mesFloats[i] = new Random().nextFloat() * 100;
		}

		// Afficher le résultat sur la console
		for (int i = 0; i < mesFloats.length; i++) {
			System.out.println("Mon float à l'indice " + i + " vaut : " + mesFloats[i]);
		}

		// Créer un nouveau tableau de 12 floats
		float mesFloats2[] = new float[12];

		// y copier les dix éléments du premier tableau.
		for (int i = 0; i < mesFloats.length; i++) {
			mesFloats2[i] = mesFloats[i];
		}

		// Mettre deux nouveaux float aléatoires dans les deux dernières 'cases'
		// mesFloats2[10] = new Random().nextFloat() * 100; 
		// mesFloats2[11] = new Random().nextFloat() * 100; 

		for (int i = mesFloats.length; i < mesFloats2.length; i++) {
			mesFloats2[i] = new Random().nextFloat(100);
		}

		// Afficher le nouveau tableau
		for (int i = 0; i < mesFloats2.length; i++) {
			System.out.println("Mon float2 à l'indice " + i + " vaut : " + mesFloats2[i]);
		}

		// Boucle for 'intelligente'
		for(float monFloat : mesFloats){
			System.out.println(monFloat);
		}
		
	}

}