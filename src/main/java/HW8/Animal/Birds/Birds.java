package HW8.Animal.Birds;

import HW8.Animal.Animal;

public abstract class Birds implements Animal {

    public Birds() {
    }

    public String getAttributes(){
        return "Voice: " + hisVoice() + ", Can Fly: " + canFly() + ", Predator: " + isPredator();
    }

    public boolean canFly(){
        return false;
    }

    public  boolean isPredator(){
        return false;
    }

    public String hisVoice(){
        return "No voice records found;";
    }

}
