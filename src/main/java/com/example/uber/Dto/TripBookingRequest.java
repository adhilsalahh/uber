package com.example.uber.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Table(name = "tripbooking")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripBookingRequest {

    String fromLocation;
    String toLocation;
    int destanceInKm;
    int bill;
    int customerId;
    int driverId;


}
