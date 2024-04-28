package HW8.Animal.fish;

import HW8.Animal.Animal;

public abstract class Fish implements Animal {

    public Fish(){
            }


    public String getFishAttributes(){
        return "Predator: " + isPredator() +
                ", can swim: " + canSwim();
    }

    protected boolean canSwim() {
        return false;
    }

    public  boolean isPredator(){
        return false;
    }
}
