package com.bigcorp.formation.tp.animal.implementation;

import com.bigcorp.formation.tp.animal.Animal;
import com.bigcorp.formation.tp.animal.Mammifere;
import com.bigcorp.formation.tp.animal.Volant;

public class ChauveSouris extends Animal implements Mammifere, Volant{

    @Override
    public void vole() {
        System.out.println("Je vole");
    }

    @Override
    public void allaite() {
        System.out.println("J'allaite mon petit");
    }
    
}
