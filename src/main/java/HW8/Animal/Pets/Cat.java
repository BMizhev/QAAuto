package HW8.Animal.Pets;

public class Cat extends Pets {
    String petVoice = "Meow!";
    boolean canBeTrained = false;
    boolean predator = true;


    public Cat (){
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
