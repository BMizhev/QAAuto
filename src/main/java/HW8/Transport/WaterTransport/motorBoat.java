package HW8.Transport.WaterTransport;

import HW8.Transport.Transport;

public class motorBoat extends Transport {
    String Class = "Water Transport";
    String Name = "Motor Boat";
    boolean canSwim = true;
    boolean hasWheels = false;
    boolean canDrive = true;
    boolean canFly = false;
    boolean hasEngine = true;

    public motorBoat (){
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
