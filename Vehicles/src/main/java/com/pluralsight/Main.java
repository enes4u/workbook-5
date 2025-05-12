package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Moped instance
      /*//  Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);*/

        /*// Car instance
        Car speedy = new Car();
        speedy.setColor("Blue");
        speedy.setNumberOfPassengers(4);
        speedy.setCargoCapacity(200);
        speedy.setFuelCapacity(40);

        // SemiTruck instance
        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setCargoCapacity(10000);
        bigRig.setFuelCapacity(150);

        // Hovercraft instance
        Hovercraft skySurfer = new Hovercraft();
        skySurfer.setColor("White");
        skySurfer.setFuelCapacity(80);


        // for example output
       // System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car fuel capacity: " + speedy.getFuelCapacity());
        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + skySurfer.getFuelCapacity());*/


        Moped slowRide = new Moped("Red", 1, 0, 5);
        System.out.println("Moped color: " + slowRide.getColor());

        Car speedy = new Car("Blue", 4, 200, 40);
        SemiTruck bigRig = new SemiTruck("Black", 2, 10000, 150);
        Hovercraft skySurfer = new Hovercraft("White", 6, 500, 80);


        System.out.println("Car fuel capacity: " + speedy.getFuelCapacity());
        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + skySurfer.getFuelCapacity());


    }
}
