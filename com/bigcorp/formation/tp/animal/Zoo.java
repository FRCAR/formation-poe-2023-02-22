package com.bigcorp.formation.tp.animal;

import com.bigcorp.formation.tp.animal.implementation.ChauveSouris;
import com.bigcorp.formation.tp.animal.implementation.Oiseau;

public class Zoo {
    
    public static void main(String[] args){

        ChauveSouris batman = new ChauveSouris();
        faitVoler(batman);
        Oiseau oiseau = new Oiseau();
        faitVoler(oiseau);
        batman.emetSon();

    }

    public static void faitVoler(Volant volant){
        System.out.println("L'animal va voler !!");
        volant.vole();
    }

}
