package com.example.uber.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int customerId;

    String mobNo;
    String Password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking>bookings=new ArrayList<>();



}
