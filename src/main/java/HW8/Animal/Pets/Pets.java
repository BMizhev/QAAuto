package HW8.Animal.Pets;

import HW8.Animal.Animal;

public class Pets implements Animal {
    public Pets(){}

    public String getPetAttributes(){
        return "Voice: " + petVoice() + ", Can Be Trained: " + canBeTrained() + ", Predator: " + isPredator();
    }

    public boolean canBeTrained(){
        return false;
    }

    public  boolean isPredator(){
        return false;
    }

    public String petVoice(){
        return "No voice records found;";
    }

}
