
package com.bigcorp.formation.exercices;

import java.util.HashSet;
import java.util.Set;

public class ExerciceSet {

    public static void main(String args[]) {
    	//Création d'un Set de Short
        Set<Short> shorts= new HashSet<>();

        // Ajout d'éléments, dont des doublons
        shorts.add((short)4);
        shorts.add((short)7);
        shorts.add((short)4);
        shorts.add((short)8);

        
        //Affichage de chaque élément du set
        for(Short element : shorts){
            System.out.println("Mon élément vaut : " + element);
        }

        // Affichage de la taille du set
        System.out.println("J'ai exactement : " + shorts.size() + " shorts.");
        
        // Vérification que le Set contient bien un élément précédemment inséré
        if(shorts.contains((short)4)){
            System.out.println("Le short 4 est bien là ! ");
        }

        // Suppression de cet élément
        shorts.remove((short)4);
        
        // Vérification que le Set ne contient plus cet élément
        if(shorts.contains((short)4)){
            System.out.println("Le short 4 est toujours là ! ");
        }else{
            System.out.println("Le short 4 n'est plus là! ");
        }
        
    }   

}
