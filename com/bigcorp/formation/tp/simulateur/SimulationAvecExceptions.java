package com.bigcorp.formation.tp.simulateur;

import com.bigcorp.formation.tp.simulateur.bateau.BateauCouleException;
import com.bigcorp.formation.tp.simulateur.bateau.implementation.BateauCivil;

public class SimulationAvecExceptions {

    public static void main(String[] args) throws Exception {
        BateauCivil titanic = new BateauCivil("Titanic");
        titanic.setNbCivils(400);

        //Ici, on gère l'erreur dans CETTE méthode
        try {
            int ageDeLaCoque = titanic.calculeAgeCoque();
            System.out.println("L'âge de la coque vaut : " + ageDeLaCoque);
        } catch (BateauCouleException e) {
            // Ce bloc catch est appelé si une exception 
            // de type BateauCouleException ou une des sous-classes
            // de BateauCouleException est lancée dans le try.

            //J'appelle la méthode qui renfloue le bateau...
            System.out.println("Erreur de bateau coulé : " + e.getMessage());
        } catch (Exception e){
            // Ce bloc catch est appelé si :
            // - aucun catch précédent n'a été appelé.
            // - une exception de type Exception ou une des sous-classes
            // de Exception est lancée dans le try.

            System.out.println("Erreur inconnue : " + e.getMessage());
        }

        //Ici, l'erreur est renvoyée à la méthode qui nous a appelé
        titanic.calculeAgeCoque();

    }

}
