package HW8.Animal.Birds;

import HW8.Animal.Animal;

public class Duck extends Birds {
    String Name = "Duck";
    String voice = "quack";
    boolean canFly = true;
    boolean predator = false;
    String Class = "Bird";
    boolean canSwim = true;
    boolean isPet = true;




    public Duck (){

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
