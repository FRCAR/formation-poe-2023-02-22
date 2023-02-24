package com.bigcorp.formation.cours;

// Classe principale
public class Boucles {
	public static void main(String[] args) {
		// Boucle for
		System.out.println("\r\n boucle for");
		for (int index = 5; index <= 9; index++) {
			System.out.println("index vaut : " + index);
		}

		// Boucle do ... while
		System.out.println("\r\n  boucle do while");
		int compteur = 0;
		do {
			System.out.println("coucou");
			compteur++;
		} while (compteur < 10);

		// Boucle while
		System.out.println("\r\n  boucle while");
		boolean aFaitUneBoucle = false;
		while (!aFaitUneBoucle) {
			System.out.println("Je boucle avec while");
			System.out.println("coucou");
		}

		// Boucle while avec break et continue
		System.out.println("\r\n boucle while");
		while (true) {
			System.out.println("Je vais afficher ce message une fois à cause du break");
			break;
		}

	}
}