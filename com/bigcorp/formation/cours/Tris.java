package com.bigcorp.formation.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.bigcorp.formation.tp.simulateur.bateau.Bateau;
import com.bigcorp.formation.tp.simulateur.bateau.BateauMilesParcourusComparator;

public class Tris {

    public static void main(String[] args) {
        // Création du registre des bateaux
        List<Bateau> registre = new ArrayList<>();
        Bateau potato = new Bateau("Le potato");
        potato.setMilesParcourus(500);
        registre.add(potato);
        Bateau abracadabra = new Bateau("Abracadabra");
        abracadabra.setMilesParcourus(100);
        registre.add(abracadabra);
        Bateau zephyr = new Bateau("Zéphyr");
        zephyr.setMilesParcourus(400);
        registre.add(zephyr);

        // Tri avec l'ordre naturel
        Collections.sort(registre);
        // Collections.reverse(registre);

        // Affichage des bateaux
        System.out.println("\r\n Je trie par l'ordre naturel : le nom des bateaux");
        for (Bateau bateau : registre) {
            System.out.println(bateau.getNom());
        }

        // Tri avec un autre ordre
        System.out.println("\r\n Je trie par miles parcourus par les bateaux");
        Collections.sort(registre, new BateauMilesParcourusComparator());
        for (Bateau bateau : registre) {
            System.out.println(bateau.getNom());
        }

        System.out.println("\r\n J'utilise un Treeset qui trie les bateaux à leur insertion");
        Set<Bateau> registreTrieParOrdreNaturel = new TreeSet<>();
        Set<Bateau> registreTrieAvecComparator = new TreeSet<>(new BateauMilesParcourusComparator());

        registreTrieParOrdreNaturel.add(zephyr);
        registreTrieParOrdreNaturel.add(potato);
        registreTrieParOrdreNaturel.add(abracadabra);
        for (Bateau bateau : registreTrieParOrdreNaturel) {
            System.out.println(bateau.getNom());
        }
    }

}
