package com.bigcorp.formation.exercices;

public class ExerciceChaineDeCaracteres {
	public static void main(String[] args) {

		// Définition et déclaration d'une chaîne valant "Hey ?"
		String hey = "Hey ?";

		// Définition et déclaration d'une chaîne valant "What's wrong with you ?"
		String whatsWrong = "What's wrong with you ?";

		// Affichage de : "Hey ? What's wrong with you ?" dans la console
		System.out.println(hey + " " + whatsWrong);

		// Récupérer le 5eme caractère de la deuxième String
		System.out.println(whatsWrong.charAt(4));
		// Récupérer la chaîne de caractères composée des 10 derniers caractères de la
		// deuxième String
		String derniersCaracteres = whatsWrong.substring(whatsWrong.length() - 10);
		System.out.println(derniersCaracteres);
		// Changer les 10 derniers caractères de la deuxieme String en majuscule.
		String premiersCaracteres = whatsWrong.substring(0, whatsWrong.length() - 10);

		System.out.println(premiersCaracteres + derniersCaracteres.toUpperCase());

	}
}