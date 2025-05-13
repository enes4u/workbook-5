package com.pluralsight;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Vehicle> allVehicles = new ArrayList<>();
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


        Moped slowRide = new Moped( 1, 0, 5, "Red");
        System.out.println("Moped color: " + slowRide.getColor());

        Car speedy = new Car( 4, 200, 40, "Blue");
        SemiTruck bigRig = new SemiTruck( 2, 10000, 150,"Black");
        Hovercraft skySurfer = new Hovercraft(5, 6, 500, "White");

        System.out.println("Before update car number of passangers "+speedy.getNumberOfPassengers());
        speedy.setNumberOfPassengers(8);

        System.out.println("Car fuel capacity: " + speedy.getFuelCapacity());
        System.out.println( " After save (update) car number of passangers "+speedy.getNumberOfPassengers());
        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + skySurfer.getFuelCapacity());

        System.out.println(speedy.toString());
        System.out.println(slowRide.toString());
        System.out.println(bigRig.toString());

        for (Vehicle vehicle: allVehicles){
            System.out.println(allVehicles.toString());
        }

    }
    public static void loadVehicles() {
        // Add 5 cars with different properties
        allVehicles.add(new Car(5, 500, 60, "Red"));
        allVehicles.add(new Car(4, 450, 55, "Green"));
        allVehicles.add(new Car(2, 300, 45, "Black"));
        allVehicles.add(new Car(7, 600, 70, "White"));
        allVehicles.add(new Car(3, 400, 50, "Blue"));

        // Add 5 mopeds with different properties
        allVehicles.add(new Moped(2, 40, 10, "Blue"));
        allVehicles.add(new Moped(1, 30, 12, "Pink"));
        allVehicles.add(new Moped(2, 50, 15, "Orange"));
        allVehicles.add(new Moped(2, 35, 8, "Yellow"));
        allVehicles.add(new Moped(1, 45, 14, "Purple"));

        // Add 5 semi trucks with different properties
        allVehicles.add(new SemiTruck(2, 25000, 500, "Blue"));
        allVehicles.add(new SemiTruck(3, 30000, 600, "Red"));
        allVehicles.add(new SemiTruck(2, 20000, 450, "Green"));
        allVehicles.add(new SemiTruck(2, 35000, 700, "Silver"));
        allVehicles.add(new SemiTruck(3, 28000, 550, "Black"));

        // Add 5 hovercrafts with different properties
        allVehicles.add(new Hovercraft(12, 1500, 250, "Silver"));
        allVehicles.add(new Hovercraft(8, 800, 180, "Gold"));
        allVehicles.add(new Hovercraft(15, 2000, 300, "Purple"));
        allVehicles.add(new Hovercraft(10, 1200, 220, "Bronze"));
        allVehicles.add(new Hovercraft(20, 2500, 400, "Platinum"));
    }

}
