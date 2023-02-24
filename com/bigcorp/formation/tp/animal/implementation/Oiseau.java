package com.bigcorp.formation.tp.animal.implementation;

import com.bigcorp.formation.tp.animal.Animal;
import com.bigcorp.formation.tp.animal.Volant;

public class Oiseau extends Animal implements Volant{

    @Override
    public void vole() {
        System.out.println("Je vole comme un oiseau");
    }
    
}
