
package com.bigcorp.formation.exercices;

public class ExerciceBoucles {
	public static void main(String[] args) {

		// utilisation de la boucle for
		// Afficher tous les nombres entiers de 1 à 13 (compris)
		System.out.println("\r\nAfficher tous les nombres entiers de 1 à 13 avec for");
		for (int i = 1; i <= 13; i++) {
			System.out.println("Mon entier vaut : " + i);
		}
		// Afficher 3 fois "Salut!"
		System.out.println("\r\nAfficher trois fois salut avec for");
		for (int i = 0; i < 3; i++) {
			System.out.println("Salut!");
		}

		// utilisation de la boucle while
		// Afficher tous les nombres entiers de 1 à 13 (compris)
		System.out.println("\r\nAfficher tous les nombres entiers de 1 à 13 avec while");
		int i = 0;
		while (i <= 13) {
			System.out.println("Mon entier vaut : " + i);
			i++;
		}
		// Afficher 3 fois "Salut!"
		System.out.println("\r\nAfficher trois fois salut avec while");
		int nombreDeFoisOuOnAAfficheSalut = 0;
		while (nombreDeFoisOuOnAAfficheSalut < 3) {
			System.out.println("Salut!");
			nombreDeFoisOuOnAAfficheSalut++;
		}

	}
}