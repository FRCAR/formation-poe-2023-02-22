package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        // ------------------
        // LISTS
        // ------------------
        // Définition d'une variable de type List<Integer> (une liste qui contient des
        // Integer)
        List<Integer> maListeDInteger;

        // Affectation d'une nouvelle instance d'ArrayList
        maListeDInteger = new ArrayList<>();

        // Utilisation de la méthode add
        maListeDInteger.add(Integer.valueOf(5));
        maListeDInteger.add(6);
        maListeDInteger.add(7);
        maListeDInteger.add(0, 4);

        // Utilisation de la méthode remove pour supprimer un élément
        maListeDInteger.remove(1);

        // Boucler sur la liste avec un index
        for (int i = 0; i < maListeDInteger.size(); i++) {
            System.out.println(maListeDInteger.get(i));
        }

        // Boucler sur la liste avec un for each
        for (Integer monInteger : maListeDInteger) {
            System.out.println(monInteger);
        }

        // Une autre liste ...
        List<String> mesPhrases = new ArrayList<>();
        mesPhrases.add("Tant va la cruche à l'eau qu'à la fin elle se brise");
        mesPhrases.add("Tel est pris qui croyait prendre");
        mesPhrases.add("Tel est reprise qui croyait reprendre");
        mesPhrases.add("Parle PAS LA BOUCHE PLEINE !!!");
        mesPhrases.remove(1);
        mesPhrases.remove("Tant va la cruche à l'eau qu'à la fin elle se brise");
        System.out.println("La collection a une taille : " + mesPhrases.size());

        // ------------------
        // SETS
        // ------------------
        Set<String> monPremierSet = new HashSet<>();
        monPremierSet.add("Coucou");
        monPremierSet.add("Coucou");
        monPremierSet.add("Les gens");
        System.out.println("monPremierSet a une taille de : " + monPremierSet.size());

        // Suppression d'un élément
        monPremierSet.remove("Coucou");
        for (String element : monPremierSet) {
            System.out.println("Dans monPremierSet, j'ai : " + element);
        }

        // Ajout de nombreux éléments d'une autre Collection (possible car Set et List
        // implémentent Collection)
        System.out.println("J'ajoute mesPhrases à monPremierSet");
        monPremierSet.addAll(mesPhrases);

        // Utilisation de iterator (utile seulement si on veut modifier la collection en
        // itérant dessus)
        for (Iterator<String> ite = monPremierSet.iterator(); ite.hasNext();) {
            String element = ite.next();
            System.out.println("Dans monPremierSet, avec l'itérateur, j'ai : " + element);
            ite.remove();
        }

        // Vidage du set et parcours : ne fait rien, mais ne plante pas
        // Il est permis d'itérer sur une collection vide, mais pas une
        // collection nulle !
        monPremierSet.clear();
        for (String element : monPremierSet) {
            System.out.println("Dans monPremierSet, j'ai : " + element);
        }

        Set<String> mesLivresPreferes = new HashSet<>();
        mesLivresPreferes.add("20 000 lieues sous les mers");
        mesLivresPreferes.add("Le développeur se rebiffe");
        mesLivresPreferes.add("Les design patterns c'est la vie");

        // ------------------
        // Map
        // ------------------
        Map<String, Integer> notes = new HashMap<>();
        notes.put("Lucie", 12);
        notes.put("Jean", 8);
        notes.put("Mohamed", 13);
        notes.put("Jacqueline", 3);
        //La ligne ci-dessous remplace la précédente valeur (3) 
        //par la nouvelle (13)
        notes.put("Jacqueline", 13);
        notes.size();
        notes.remove("Lucie");

        System.out.println("La note de Jacqueline vaut : " + notes.get("Jacqueline"));

        //Il est possible de mettre n'importe quel type dans la clé et la valeur
        //Exemple ici la valeur contient une liste d'Integer
        Map<String, List<Integer>> notesMultiples = new HashMap<>();
        notesMultiples.put("Lucie", new ArrayList<>());
        notesMultiples.get("Lucie").add(4);

    }

}
