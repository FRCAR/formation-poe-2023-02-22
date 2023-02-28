package com.bigcorp.formation.cours;

/**
 * Enum décrivant les seuls types de pizza possibles.
 * Attention chaque valeur énumérée contient un booléen
 */
public enum TypePizza {

    MARGHERITA(false), QUATRE_FROMAGES(false), SAUMON(true), REGINA(false), CALZONE(false);

    private boolean allergenes;

    private TypePizza(boolean allergenes){
        this.allergenes = allergenes;
    }

    public boolean getAllergenes() {
        return allergenes;
    }

}
