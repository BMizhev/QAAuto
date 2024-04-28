package HW8.Transport.AirTransport;

import HW8.Transport.Transport;

public class Balloon extends Transport {
    String Class = "Air Transport";
    String Name = "Hot Air Balloon";
    boolean canSwim = false;
    boolean hasWheels = false;
    boolean canDrive = false;
    boolean canFly = true;
    boolean hasEngine = false;

    public Balloon (){
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
