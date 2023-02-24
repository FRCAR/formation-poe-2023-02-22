package com.bigcorp.formation.cours;

// Classe principale
public class Conditions {
	public static void main(String[] args) {
		short forceElephant = 10;
		short forceRhinoceros = 12;

		// if then else
		System.out.println("Comparaison if/then");
		if (forceElephant > forceRhinoceros) {
			System.out.println("L'éléphant est plus fort !");
		} else {
			System.out.println("Le rhinoceros le plus fort.");
		}

		// switch
		switch (forceRhinoceros) {
			case 1:
				System.out.println("La force du rhino vaut 1");
				break;
			case 12:
				System.out.println("La force du rhino vaut 12");
				break;
			case 13:
				System.out.println("La force du rhino vaut 13");
				break;
			default:
				System.out.println("Je ne mesure pas la force du rhinocéros.");
				break;
		}

		// switch case avec blocs (plus besoin de break)
		int resultat = 0;
		switch (forceElephant) {
			case 1, 3, 5 -> {
				System.out.println("L'éléphant est plutôt fort");
				resultat = -1;
			}
			case 6, 7, 8, 9, 10 -> {
				System.out.println("L'éléphant est fort");
				resultat = 0;
			}
			default -> {
				System.out.println("Je ne mesure pas la force de l'éléphant");
				resultat = 1;
			}
		}

		// Switch case dont le résultat est stocké dans une variable avec yield
		int forceEnNewton = switch (forceElephant) {
			case 1 -> {
				yield 200;
			}
			default -> {
				yield 400;
			}
		};

		// Condition ternaire
		System.out.println(
				forceElephant > forceRhinoceros ? "L'éléphant est plus fort" : "Le rhinocéros est le plus fort");

		// Condition ternaire composée
		System.out.println(forceElephant > forceRhinoceros
				? forceElephant == forceRhinoceros ? "Les deux bêtes ont une force égale" : "L'éléphant est plus fort"
				: "Le rhinocéros est le plus fort");

	}

}