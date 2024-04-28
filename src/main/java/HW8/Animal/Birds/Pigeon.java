package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Pigeon extends Birds {
    String voice = "Coo!";
    boolean canFly = true;
    boolean predator = true;

    public Pigeon (){
        super();

    }
    @Override
    public String hisVoice(){
        return voice;
    }
    public boolean isPredator(){
        return predator;
    }
    public boolean canFly(){
        return canFly;
    }
}
