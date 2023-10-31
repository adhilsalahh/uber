package com.example.uber.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tripbooking")
@Data
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tripBookingId;

    String fromLocation;
    String toLocation;

    int destanceInKm;
    int bill;

    @Enumerated(value = EnumType.STRING)
    TripStatus status;

    @ManyToOne
    @JoinColumn
    Customer customer;
    @ManyToOne
    @JoinColumn
    Driver driver;

}
