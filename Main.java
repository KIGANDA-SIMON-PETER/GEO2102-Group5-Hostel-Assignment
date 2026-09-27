/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author julian
 */
public class Main {

    public static void main(String[] args) {

        // Create a Hostel object for H20
        Hostel h20 = new Hostel(
            "H20",
            "K Zone Hostels",
            "Not self-contained (Single)",
            400000,
            "Vacant",
            0.6120532,
            32.477079
        );

        // Create a Hostel object for H21
        Hostel h21 = new Hostel(
            "H21",
            "K Zone",
            "Not self-contained (Single)",
            400000,
            "Vacant",
            0.61652754,
            32.472695
        );

        // Create a Hostel object for H22
        Hostel h22 = new Hostel(
            "H22",
            "Lamoze Hostels",
            "Self-contained (Single)",
            600000,
            "Occupied",
            0.6152443,
            32.466976
        );

        // Create a Hostel object for H23
        Hostel h23 = new Hostel(
            "H23",
            "Nkwine Hostels",
            "Not self-contained (Single)",
            300000,
            "Partially Occupied",
            0.61875638,
            32.473324
        );

        // Store all Group 5 hostel objects in an array
        Hostel[] hostels = {h20, h21, h22, h23};

        // Variables used for calculations
        double totalRent = 0;
        int fullyOccupied = 0;
        int notFullyOccupied = 0;

        // Loop through every hostel in the array
        for (Hostel h : hostels) {

            // Display the hostel details
            System.out.println("Hostel ID: " + h.hostelId);
            System.out.println("Hostel Name: " + h.hostelName);
            System.out.println("Accommodation Type: " + h.accommodationType);
            System.out.println("Rental Price: UGX " + h.rentalPrice);
            System.out.println("Occupancy Status: " + h.occupancyStatus);
            System.out.println("Latitude: " + h.latitude);
            System.out.println("Longitude: " + h.longitude);

            // Determine whether the hostel is fully occupied
            boolean isOccupied = h.occupancyStatus.equals("Occupied");

            // Report occupancy status using selection
            if (isOccupied) {
                System.out.println("Occupancy: Fully Occupied");
                fullyOccupied++;
            } else {
                System.out.println("Occupancy: Not Fully Occupied");
                notFullyOccupied++;
            }

            // Add the rental price to the total
            totalRent += h.rentalPrice;

            System.out.println("-----------------------------------");
        }

        // Calculate the average rental price
        double averageRent = totalRent / hostels.length;

        // Display the final results
        System.out.println("\nFINAL RESULTS");
        System.out.println("-----------------------------------");
        System.out.printf("Average Rental Price: UGX %.0f%n", averageRent);
        System.out.println("Fully Occupied Hostels: " + fullyOccupied);
        System.out.println("Not Fully Occupied Hostels: " + notFullyOccupied);
    }

            
         
    
}
