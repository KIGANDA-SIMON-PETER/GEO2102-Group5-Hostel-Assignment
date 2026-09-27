/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

//// The Hostel class represents one hostel record.
public class Hostel {

    // Fields used to store hostel information
    String hostelId;
    String hostelName;
    String accommodationType;
    double rentalPrice;
    String occupancyStatus;
    double latitude;
    double longitude;

    // Constructor used to create a Hostel object
    public Hostel(String hostelId, String hostelName, String accommodationType,
                  double rentalPrice, String occupancyStatus,
                  double latitude, double longitude) {

        // Assign the supplied values to the object's fields
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
}
