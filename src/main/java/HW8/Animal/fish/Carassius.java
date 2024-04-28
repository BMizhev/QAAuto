package HW8.Animal.fish;

public class Carassius extends Fish {

    boolean predator = false;
    boolean canSwim = true;


    public Carassius (){
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
