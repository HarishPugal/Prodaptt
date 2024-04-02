package com.packages;

import java.util.ArrayList;
import java.util.List;

public class MainForVechicle {
    public static void main(String[] args) {
        // Initialize the list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("1", "Car", true, 5));
        vehicles.add(new Vehicle("2", "Bike", true, 2));
        vehicles.add(new Vehicle("3", "Bike", true, 7));
        vehicles.add(new Vehicle("4", "Car", true, 4));
        vehicles.add(new Vehicle("5", "Car", false, 3));
        vehicles.add(new Vehicle("6", "Van", true, 9));

        // Initialize the rental system
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(vehicles);

        // Create a new rental request
        RentalRequest request = new RentalRequest("Bike", 2);

        // Try to process the rental request
        try {
            rentalSystem.processRentalRequest(request);
        } catch (VehicleUnavailableException | InvalidRentalPeriodException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}