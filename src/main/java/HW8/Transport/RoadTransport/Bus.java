package HW8.Transport.RoadTransport;

import HW8.Transport.Transport;

public class Bus extends Transport {
    String Class = "Road Transport";
    String Name = "Bus";
    boolean canSwim = false;
    boolean hasWheels = true;
    boolean canDrive = true;
    boolean canFly = false;
    boolean hasEngine = true;

    public Bus (){
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
