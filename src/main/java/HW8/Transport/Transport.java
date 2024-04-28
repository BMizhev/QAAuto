package HW8.Transport;

public abstract class Transport {

    public String getTransportAttributes(){
        return "Class: " + whichClass()
                + ", Name: " + hisName()
                + ", Can Fly: " + canFly()
                + ", Can Swim: " + canSwim()
                + ", Has Wheels: " + hasWheels()
                + ", Can Drive: " + canDrive()
                + ", Has Engine: " + hasEngine();


    }

    public String whichClass(){
        return "Transport";
    }

    public String hisName(){
        return "Name";
    }

    public boolean canSwim(){
        return false;
    }

    public boolean hasWheels(){
        return false;
    }

    public boolean canDrive(){
        return false;
    }

    public boolean canFly(){
        return false;
    }

    public  boolean hasEngine(){
        return false;
    }


}
