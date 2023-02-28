package com.bigcorp.formation.tp.simulateur;

import com.bigcorp.formation.cours.MonException;
import com.bigcorp.formation.cours.TypePizza;
import com.bigcorp.formation.tp.simulateur.bateau.Bateau;
import com.bigcorp.formation.tp.simulateur.bateau.implementation.BateauCivil;
import com.bigcorp.formation.tp.simulateur.bateau.implementation.BateauMilitaire;

public class SimulationAvecControleur {

    public static void main(String[] args) {
        BateauCivil titanic = new BateauCivil("Titanic");
        titanic.setNbCivils(400);
        BateauMilitaire bateauMilitaire = new BateauMilitaire("Le Redoutable");
        bateauMilitaire.setForceCanon(40);
        Bateau bateauDeBase = new Bateau("Bateau de base");

        Controleur controleurLocal = new Controleur();
        controleurLocal.controle(titanic);
        controleurLocal.controle(bateauMilitaire);
        controleurLocal.controle(bateauDeBase);

      

    }

}
