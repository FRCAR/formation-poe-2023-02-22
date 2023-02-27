
package com.bigcorp.formation.exercices;

import java.util.HashMap;
import java.util.Map;

public class ExerciceMap {

    public static void main(String args[]) {
    	//Création d'une Map dictionnaire avec comme type de clé String et comme type de valeur String
        Map<String, String> dictionnaire = new HashMap<>();
        
        // La clé est le nom , la valeur est la définition
        // Ajout des définitions (dont un doublon).
        dictionnaire.put("jaune", "Adjectif qualifiant quelque chose de la couleurs jaune");
        dictionnaire.put("porte", "Partie d'une habitation qui s'ouvre et se ferme");
        dictionnaire.put("placard", "Partie d'une habitation servant à ranger des objets.");
        dictionnaire.put("jaune", "Ben, c'est jaune");

        
        // Affichage de la taille de la map
        System.out.println("Mon dictionnaire contient : " + dictionnaire.size() + " mots.");
        
        //Affichage d'une définition d'un mot
        System.out.println("La définition de jaune vaut : " + dictionnaire.get("jaune"));
        
        //Affichage de chaque définition avec sa clé et sa valeur
        for (String mot: dictionnaire.keySet()) {
            System.out.println(mot +  " : " + dictionnaire.get(mot));
        }
        
        // Suppression d'un élément de la map
        dictionnaire.remove("porte");
        
    }

   

}
