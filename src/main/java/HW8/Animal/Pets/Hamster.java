package HW8.Animal.Pets;


public class Hamster extends Pets {
    String petVoice;
    boolean canBeTrained = false;
    boolean predator = false;


    public Hamster (){
        super();

    }
    @Override
    public String petVoice(){
        return super.petVoice();
    }
    public boolean isPredator(){
        return predator;
    }

    public boolean canBeTrained(){
        return this.canBeTrained;
    }

}
