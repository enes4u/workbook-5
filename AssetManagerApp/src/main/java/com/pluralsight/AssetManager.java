package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;


public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Adding Houses
        assets.add(new House("My House", "2010-06-15", 250000, "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2015-08-20", 180000, "456 Beach Ave", 2, 1500, 3000));

        // Adding Vehicles
        assets.add(new Vehicle("Topher's Truck", "2018-03-10", 35000, "Ford F-150", 2018, 120000));
        assets.add(new Vehicle("Lisa's Car", "2020-07-05", 25000, "Toyota Corolla", 2020, 90000));
        assets.add(new Vehicle("Abishek's Sports Car", "2016-02-14", 45000, "Chevrolet Camaro", 2016, 80000));
        assets.add(new Vehicle("Kamron's SUV", "2012-11-30", 38000, "Honda CR-V", 2012, 105000));
        // Loop through assets and display details
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            // Display Menu
            System.out.println("\nAsset Manager - Choose an Option:");
            System.out.println("1. View All Assets");
            System.out.println("2. Add a New House");
            System.out.println("3. Add a New Vehicle");
            System.out.println("*. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            if (choice.equals("*")) {
                System.out.println("Exiting Asset Manager...");
                break; // Exit the loop
            }

            switch (choice) {
                case "1":
                    System.out.println(assets); // to String overwrite used

                    System.out.println("\nListing All Assets:");
                    for (Asset asset : assets) {
                        System.out.println("Description: " + asset.getDescription());
                        System.out.println("Date Acquired: " + asset.getDateAcquired());
                        System.out.println("Original Cost: $" + asset.getOriginalCost());
                        System.out.println("Current Value: $" + asset.getValue());

                        if (asset instanceof House) {
                            House house = (House) asset;
                            System.out.println("Address: " + house.getAddress());
                        } else if (asset instanceof Vehicle) {
                            Vehicle vehicle = (Vehicle) asset;
                            System.out.println("Make & Model: " + vehicle.getMakeModel());
                            System.out.println("Year: " + vehicle.getYear());
                        }
                        System.out.println("---------------------------");
                    }
                    break;

                case "2":
                    System.out.print("Enter house description: ");
                    String houseDesc = scanner.nextLine();
                    System.out.print("Enter acquisition date (YYYY-MM-DD): ");
                    String houseDate = scanner.nextLine();
                    System.out.print("Enter original cost: ");
                    double houseCost = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter address: ");
                    String houseAddress = scanner.nextLine();
                    System.out.print("Enter condition (1-Excellent, 2-Good, 3-Fair, 4-Poor): ");
                    int houseCondition = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter square footage: ");
                    int houseSquareFoot = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter lot size: ");
                    int houseLotSize = Integer.parseInt(scanner.nextLine());

                    assets.add(new House(houseDesc, houseDate, houseCost, houseAddress, houseCondition, houseSquareFoot, houseLotSize));
                    System.out.println("New house added successfully!");
                    break;

                case "3":
                    System.out.print("Enter vehicle description: ");
                    String vehicleDesc = scanner.nextLine();
                    System.out.print("Enter acquisition date (YYYY-MM-DD): ");
                    String vehicleDate = scanner.nextLine();
                    System.out.print("Enter original cost: ");
                    double vehicleCost = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter make & model: ");
                    String vehicleMakeModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int vehicleYear = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter odometer reading: ");
                    int vehicleOdometer = Integer.parseInt(scanner.nextLine());

                    assets.add(new Vehicle(vehicleDesc, vehicleDate, vehicleCost, vehicleMakeModel, vehicleYear, vehicleOdometer));
                    System.out.println("New vehicle added successfully!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
