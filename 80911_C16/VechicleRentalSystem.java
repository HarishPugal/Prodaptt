package com.packages;

import java.util.List;


// A simple class representing a vehicle
class Vehicle {
    String id;
    String type;
    boolean isAvailable;
    int availableDays;

    // Constructor for Vehicle class
    public Vehicle(String id, String type, boolean isAvailable, int availableDays) {
        this.id = id;
        this.type = type;
        this.isAvailable = isAvailable;
        this.availableDays = availableDays;
    }
}

// A class representing a rental request
class RentalRequest {
    String vehicleType;
    int rentalPeriod;

    // Constructor for RentalRequest class
    public RentalRequest(String vehicleType, int rentalPeriod) {
        this.vehicleType = vehicleType;
        this.rentalPeriod = rentalPeriod;
    }
}

// Exception for invalid rental period
class InvalidRentalPeriodException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidRentalPeriodException(String message) {
        super(message);
    }
}

// Exception for vehicle unavailability
class VehicleUnavailableException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VehicleUnavailableException(String message) {
        super(message);
    }
}

// A class for managing the vehicle rental system
class VehicleRentalSystem {
    List<Vehicle> vehicles;

    // Constructor for VehicleRentalSystem class
    public VehicleRentalSystem(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // Method for processing a rental request
    public void processRentalRequest(RentalRequest rentalRequest) throws VehicleUnavailableException, InvalidRentalPeriodException {
        // Check if the rental period is valid
        if (rentalRequest.rentalPeriod < 1) {
            throw new InvalidRentalPeriodException("Invalid rental period.");
        }

        // Iterate through the vehicles to find a matching available vehicle
        for (Vehicle vehicle : vehicles) {
            if (vehicle.type.equals(rentalRequest.vehicleType) && vehicle.isAvailable && vehicle.availableDays >= rentalRequest.rentalPeriod) {
                // If a matching vehicle is found, update its availability and deduct the rental period
                vehicle.isAvailable = false;
                vehicle.availableDays -= rentalRequest.rentalPeriod;

                // Calculate the total rental charge
                double totalCharge = rentalRequest.rentalPeriod * 30.0;
                System.out.println("Rental Confirmation:\n- Vehicle ID: " + vehicle.id
                        + "\n- Rental Period: " + rentalRequest.rentalPeriod + " days\n- Total Rental Charge: $" + totalCharge);

                // Return after successful processing
                return;
            }
        }

        // If no available vehicle is found, throw an exception
        throw new VehicleUnavailableException("Requested vehicle type \"" + rentalRequest.vehicleType + "\" is unavailable.");
    }
}

