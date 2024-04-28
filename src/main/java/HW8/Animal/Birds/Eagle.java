package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Eagle extends Birds {
    String voice = "SCREEEE!";
    boolean canFly = true;
    boolean predator = true;


    public Eagle (){
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
        return this.canFly;
    }
}
