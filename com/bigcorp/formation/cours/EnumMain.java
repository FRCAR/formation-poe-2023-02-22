package com.bigcorp.formation.cours;

public class EnumMain {

    public static void main(String[] args) {
        TypePizza type1 = TypePizza.CALZONE;
        System.out.println(type1);

        if (type1 == TypePizza.QUATRE_FROMAGES) {
            System.out.println("Miam le fromage");
        } else if (type1 == TypePizza.SAUMON) {
            System.out.println("Miam le saumon");
        } else {
            System.out.println("Miam la pizza");
        }

        switch (type1) {
            case MARGHERITA -> {
                System.out.println("C'est bon la margherita");
            }
            case QUATRE_FROMAGES -> {
                System.out.println("C'est bon la 4 fromages");
            }
            case SAUMON -> {
                System.out.println("C'est bon la pizza au saumon");
            }
            case REGINA -> {
                System.out.println("C'est bon la regina");
            }
            default ->{
                System.out.println("C'est bon la pizza");
            }
            
        }

        // A proscrire : l'utilisation de chaînes de caractères
        // n'offre AUCUN contrôle à la compilation
        String typePizzaString = "margherta";
        switch (typePizzaString) {
            case "margherita" -> {
                System.out.println("C'est bon la margherita");
            }
            case "quatre_fromages" -> {
                System.out.println("C'est bon la 4 fromages");
            }
        }

        // Affiche toutes les valeurs des types de Pizza
        System.out.println("\r\n Tous les types de pizzas sont : ");
        for (TypePizza typePizza : TypePizza.values()) {
            System.out.println(typePizza);
        }

        String maChaine = "SAUMON";
        TypePizza typeFromString = TypePizza.valueOf(maChaine);
        System.out.println("\r\n typeFromString vaut : " + typeFromString);
        System.out.print("Cette pizza contient-elle des allergènes : " + typeFromString.getAllergenes());

    }

}
