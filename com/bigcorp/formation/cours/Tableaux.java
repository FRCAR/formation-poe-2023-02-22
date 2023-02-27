/**
 * Exemple sur les tableaux
 */

package com.bigcorp.formation.cours;

import com.bigcorp.formation.tp.simulateur.bateau.Bateau;

// Classe principale
public class Tableaux {
	public static void main(String[] args) {
		// Declaration d'un tableau sans l'alimenter
		int monPremierTableau[] = new int[4];

		// Affectation des valeurs a un tableau
		// Remarque : le premier indice du tableau est 0
		monPremierTableau[0] = 4;

		// Affichage d'une valeur d'un tableau
		System.out.println("La valeur de la première 'case' de mon tableau vaut : " + monPremierTableau[0]);

		// Affichage d'une valeur non attribue d'un tableau (cela est égal à sa valeur
		// par défaut)
		System.out.println("La valeur de la dernière 'case' de mon tableau vaut : " + monPremierTableau[3]);

		// Vouloir acceder a un index non inclus dans un tableau genere une exception
		// System.out.println("La valeur de la dernière 'case' de mon tableau vaut : " +
		// monPremierTableau[4]);

		// Déclaration d'un tableau sans declarer son nombre d'elements et alimente
		// directement
		String mesChaines[] = { "ok", "ko", "ne sait pas" };
		Bateau mesBateaux[] = { new Bateau("le rutilant"), new Bateau("le flamboyant") };

		// Parcours du tableau pour afficher les elements
		System.out.println("La taille du tableau mesChaines vaut : " + mesChaines.length);
		for (int i = 0; i < mesChaines.length; i++) {
			System.out.println("L'élément " + i + " du tableau mesChaines vaut : " + mesChaines[i]);
		}

		// Tableau a deux dimensions
		String echiquier[][] = new String[3][3];

		// Affichage des dimensions du tableau
		System.out.println("La première dimension du tableau echiquier a la taille : " + echiquier.length);

		// Parcours du tableau pour le remplir
		for (int i = 0; i < echiquier.length; i++) {
			String[] colonne = echiquier[i];
			for (int j = 0; j < colonne.length; j++) {
				colonne[j] = "("+ i + "," + j +  ")";
			}
		}
		// Parcours du tableau pour afficher le contenu.
		for (int i = 0; i < echiquier.length; i++) {
			String[] colonne = echiquier[i];
			for (int j = 0; j < colonne.length; j++) {
				System.out.println("Aux index : (" + i + "," + j + ") , j'ai la valeur : " + colonne[j]);
			}
		}

		for (int i = 0; i < echiquier.length; i++) {
			String[] colonne = echiquier[i];
			for (int j = 0; j < colonne.length; j++) {
				System.out.println("Aux index : (" + i + "," + j + ") , j'ai la valeur : " + echiquier[i][j]);
			}
		}

	}

}