package HW8.Transport.AirTransport;

import HW8.Transport.Transport;

public class Plane extends Transport {
    String Class = "Air Transport";
    String Name = "Plane";
    boolean canSwim = false;
    boolean hasWheels = true;
    boolean canDrive = true;
    boolean canFly = true;
    boolean hasEngine = true;

    public Plane (){
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
