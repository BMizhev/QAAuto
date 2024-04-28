package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Stork extends Birds {
    String voice = "clattering sounds!";
    boolean canFly = true;
    boolean predator = true;

    public Stork (){
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
