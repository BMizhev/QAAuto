package HW8;

import HW8.Animal.Birds.*;
import HW8.Animal.Pets.Cat;
import HW8.Animal.Pets.Dog;
import HW8.Animal.Pets.Hamster;
import HW8.Animal.fish.Carassius;
import HW8.Animal.fish.Catfish;
import HW8.Animal.fish.Pike;
import HW8.Transport.AirTransport.Balloon;
import HW8.Transport.AirTransport.Chopper;
import HW8.Transport.AirTransport.Plane;
import HW8.Transport.RoadTransport.Bus;
import HW8.Transport.RoadTransport.Car;
import HW8.Transport.RoadTransport.Tractor;
import HW8.Transport.WaterTransport.BARZHA;
import HW8.Transport.WaterTransport.Boat;
import HW8.Transport.WaterTransport.motorBoat;
import org.checkerframework.checker.units.qual.C;


public class Main {
    public static void main(String[] args) {

        Duck duck1 = new Duck();
        System.out.println("Duck: "+duck1.getAttributes());
        Eagle Eagle1 = new Eagle();
        System.out.println("Eagle: "+Eagle1.getAttributes());
        Kiwi kiwi = new Kiwi();
        System.out.println("kiwi: "+kiwi.getAttributes());
        Penguin penguin = new Penguin();
        System.out.println("Penguin: "+ penguin.getAttributes());
        Stork Stork = new Stork();
        System.out.println("Stork: "+Stork.getAttributes());
        Pigeon Pigeon = new Pigeon();
        System.out.println("Pigeon: " + Pigeon.getAttributes());

        Carassius fish1 = new Carassius();
        System.out.println("Carassius: " + fish1.getFishAttributes());
        Catfish fish2 = new Catfish();
        System.out.println("Catfish: " + fish2.getFishAttributes());
        Pike fish3 = new Pike();
        System.out.println("Pike: " + fish3.getFishAttributes());

        Cat cat = new Cat();
        System.out.println("Cat: " + cat.getPetAttributes());
        Dog dog = new Dog();
        System.out.println("Dog: "+ dog.getPetAttributes());
        Hamster Hamster = new Hamster();
        System.out.println("Hamster: "+Hamster.getPetAttributes());

        Plane Plane = new Plane();
        System.out.println(Plane.getTransportAttributes());
        Chopper Heli = new Chopper();
        System.out.println(Heli.getTransportAttributes());
        Balloon Bal = new Balloon();
        System.out.println(Bal.getTransportAttributes());

        Bus bus = new Bus();
        System.out.println(bus.getTransportAttributes());
        Car car = new Car();
        System.out.println(car.getTransportAttributes());
        Tractor T1000 = new Tractor();
        System.out.println(T1000.getTransportAttributes());

        Boat B1 = new Boat();
        System.out.println(B1.getTransportAttributes());
        motorBoat B2 = new motorBoat();
        System.out.println(B2.getTransportAttributes());
        BARZHA B3 = new BARZHA();
        System.out.println(B3.getTransportAttributes());
















    }
}
