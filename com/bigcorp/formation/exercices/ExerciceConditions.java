package com.bigcorp.formation.exercices;

import java.util.Scanner;

// Classe principale
public class ExerciceConditions {
	public static void main(String[] args) {
		// Récupération de deux variables a et b
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer un entier a");
		int a = scannerClavier.nextInt();
		scannerClavier.nextLine();
		System.out.println("Veuillez entrer un entier b");
		int b = scannerClavier.nextInt();
		scannerClavier.nextLine();
		System.out.println("Veuillez entrer un entier c");
		int c = scannerClavier.nextInt();
		scannerClavier.nextLine();

		// Chercher le maximum entre a et b (ne faîtes pas ça chez vous, il
		// y a beaucoup mieux en mode 'Programmation Orientée Objet')
		// et afficher le résultat
		int maxAB = a;
		if (b > a) {
			maxAB = b;
		}
		System.out.println("Le max de a,b vaut : " + maxAB);

		// Chercher le maximum entre a,b et c
		// et afficher le résultat
		int maxABC = a;
		if (b > a) {
			if (c > b) {
				maxABC = c;
			} else {
				maxABC = b;
			}
		} else {
			if (c > a) {
				maxABC = c;
			} else {
				maxABC = a;
			}
		}
		System.out.println("Le max de a,b,c vaut : " + maxABC);
		
		// Afficher si a est pair ou impair avec un switch
		switch (a % 2) {
			case 0:
			System.out.println("a est pair");
			break;
			default:
			System.out.println("a est impair");
		}
		
		// Même algo, avec le switch et les blocs de code
		switch (a % 2) {
			case 0 -> {
				System.out.println("a est pair");
			}
			default -> {
				System.out.println("a est impair");
			}
		}
		
		// Afficher si a est pair ou impair avec une expression ternaire
		System.out.println("Avec une expression ternaire : " + (a % 2 == 0 ? "a est pair" : "a est impair"));
		
		// Fermeture des ressources (il y a mieux pour ce faire, mais nous verrons cela
		// plus tard)
		scannerClavier.close();
		
		Bateau bateau = new Bateau();
		for (int i = 0; i < 4; i++) {
			System.out.println(bateau.toString() + i);
		}

	}
}