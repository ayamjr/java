package tn.esprit.gestionzoo.entities;

public class Aquatic {
     
        private String habitat;
    
        public Aquatic(String habitat) {
            this.habitat = habitat;
        }
    
        public String getHabitat() {
            return habitat;
        }
        public void swim() {
            System.out.println("This aquatic animal is swimming.");
        }
    
        @Override
        public String toString() {
            return "Habitat: " + habitat;
        }
    }
    
    

