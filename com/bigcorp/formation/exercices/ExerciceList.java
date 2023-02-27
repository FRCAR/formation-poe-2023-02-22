package com.bigcorp.formation.exercices;

import java.util.ArrayList;
import java.util.List;

public class ExerciceList {

	public static void main(String args[]) {
		// Déclaration d'une liste de Integer
		List<Integer> maListe = new ArrayList<>();

		// Ajout d'éléments
		maListe.add(5);
		maListe.add(6);
		maListe.add(7);

		for (Integer element : maListe) {
			System.out.println("Ma liste contient : " + element);
		}

		// Ajout d'élément à un index donné
		maListe.add(0,4);

		// Afficher la taille de la liste
		System.out.println("La taille de la liste vaut : " + maListe.size());

		// Affichage de la liste (parcours de chaque élément)
		for (Integer element : maListe) {
			System.out.println("Ma liste contient : " + element);
		}

		// Suppression d'un élément à un certain index
		maListe.remove(1);

		// Affichage de la liste (parcours de chaque élément)
		for (Integer element : maListe) {
			System.out.println("Ma liste contient : " + element);
		}

	}

}
