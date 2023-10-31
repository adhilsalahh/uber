package com.example.uber.Service;

import com.example.uber.Dto.TripBookingRequest;
import com.example.uber.Model.Customer;
import com.example.uber.Model.Driver;
import com.example.uber.Model.TripBooking;
import com.example.uber.Model.TripStatus;
import com.example.uber.Repository.CustomerRepository;
import com.example.uber.Repository.DriverRepository;
import com.example.uber.Repository.TripBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripBookingService {
    @Autowired
    TripBookingRepository tripBookingRepository;

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    DriverRepository driverRepository;
//    public TripBooking insertBooking (TripBookingRequest tripBookingRequest) {
//
//        TripBooking tripBooking=new TripBooking();
//
//        tripBooking.setFromLocation(tripBookingRequest.getFromLocation());
//        tripBooking.setToLocation(tripBookingRequest.getToLocation());
//        tripBooking.setBill(tripBookingRequest.getBill());
//        tripBooking.setDestanceInKm(tripBooking.getDestanceInKm());
//        tripBooking.setStatus(TripStatus.CONFIRMED);
//
//        Customer customer=customerRepository.findById(tripBookingRequest.getCustomerId()).get();
//
//
//    }


}
