package com.example.uber.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "driver")
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int driverId;
    String mobNo;

    String password;
    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    Cab cab;
    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    List<TripBooking> bookings=new ArrayList<>();
}
