package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bigcorp.formation.tp.simulateur.bateau.BateauMilesParcourusComparator;

public class Streams {

	public static void main(String[] args) {

		// Création d'une liste de Strings
		List<String> superList = new ArrayList<>();
		superList.add("coucou");
		superList.add("les");
		superList.add("gens");
		superList.add("super");
		superList.add("youpi");

		// Les deux instructions ci-dessous sont équivalents fonctionnellement 
		Collections.sort(superList, (String s1, String s2) -> {
			return s1.toUpperCase().compareTo(s2.toUpperCase());
		});
		Collections.sort(superList, new StringDummyComparator());

		// Transformation d'une liste en streams
		superList.stream().forEach(s -> System.out.println(s));

		// Un équivalent plus compact
		superList.stream().forEach(System.out::println);

		// Utilisation d'une lambda pour filtrer les éléments dont la longueur <= 2
		System.out.println("Affichage des élements filtrés");
		final int longueurMinimale = 4;
		superList.stream().filter(s -> s.length() > longueurMinimale).forEach(s -> System.out.println(s));

		//Le code ci-dessus remplace la boucle ci-dessous
		for(String s : superList){
			if(s.length() > 4 ){
				System.out.println(s);
			}
		}

		superList.stream().peek(s -> System.out.println("peek " + s)).filter(s ->s.length() > 0).forEach(s -> System.out.println("colegram " + s));



	}
}
