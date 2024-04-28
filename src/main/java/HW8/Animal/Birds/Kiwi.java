package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Kiwi extends Birds {
    String voice;
    boolean canFly = false;
    boolean predator = false;


    public Kiwi (){
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

