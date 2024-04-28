package HW8.Animal.fish;

public class Catfish extends Fish {
    boolean predator = true;
    boolean canSwim = true;


    public Catfish (){
        super();

    }
    @Override

    public boolean isPredator(){
        return predator;
    }

    public boolean canSwim(){
        return this.canSwim;
    }
}
