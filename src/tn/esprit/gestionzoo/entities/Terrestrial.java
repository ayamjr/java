package tn.esprit.gestionzoo.entities;

public class Terrestrial {
    
    private int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }
    @Override
    public String toString() {
        return "Number of Legs: " + nbrLegs;
    }
}

