package com.example.uber.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cab")
@Data
public class  Cab {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int carId;
    int perKmRate;
    @OneToOne
    @JoinColumn
    Driver driver;
}
