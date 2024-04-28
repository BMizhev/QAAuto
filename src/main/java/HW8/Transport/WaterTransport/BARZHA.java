package HW8.Transport.WaterTransport;

import HW8.Transport.RoadTransport.Tractor;
import HW8.Transport.Transport;

public class BARZHA extends Transport {
    String Class = "Water Transport";
    String Name = "Barge";
    boolean canSwim = true;
    boolean hasWheels = false;
    boolean canDrive = false;
    boolean canFly = false;
    boolean hasEngine = false;

    public BARZHA (){
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
