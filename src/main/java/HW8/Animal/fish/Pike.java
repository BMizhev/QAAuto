package HW8.Animal.fish;

public class Pike extends Fish {
    boolean predator = true;
    boolean canSwim = true;


    public Pike (){
        super();

    }
    @Override
    public boolean isPredator(){
        return predator;
    }

    public boolean canSwim(){
        return canSwim;
    }

}
