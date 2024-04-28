package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Ostrich extends Birds {

    String voice;
    boolean canFly = true;
    boolean predator = false;


    public Ostrich (){
        super();

    }
    @Override

    public String hisVoice(){
        return super.hisVoice();
    }
    public boolean isPredator(){
        return predator;
    }

    public boolean canFly(){
        return canFly;
    }
}

