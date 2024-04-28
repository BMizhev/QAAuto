package HW8.Animal.Pets;


public class Dog extends Pets {
    String petVoice = "Gaff!";
    boolean canBeTrained = true;
    boolean predator = true;


    public Dog (){
        super();

    }
    @Override
    public String petVoice(){
        return petVoice;
    }
    public boolean isPredator(){
        return predator;
    }

    public boolean canBeTrained(){
        return this.canBeTrained;
    }
}
