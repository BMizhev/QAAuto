package HW8.Transport.RoadTransport;

import HW8.Transport.Transport;

public class Tractor extends Transport {
    String Class = "Road Vehicle";
    String Name = "Tractor";
    boolean canSwim = false;
    boolean hasWheels = true;
    boolean canDrive = true;
    boolean canFly = false;
    boolean hasEngine = true;

    public Tractor (){
        super();
    }
    @Override

    public String whichClass(){
        return Class;
    }
    public String hisName(){
        return Name;
    }
    public boolean canSwim(){
        return canSwim;
    }
    public boolean hasWheels(){
        return hasWheels;
    }
    public boolean canDrive(){
        return canDrive;
    }
    public boolean canFly(){
        return canFly;
    }
    public boolean hasEngine(){
        return hasEngine;
    }

}
