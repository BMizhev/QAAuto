package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Penguin extends Birds {
    String voice = "Honk!";
    boolean canFly = false;
    boolean predator = true;

    public Penguin (){
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
