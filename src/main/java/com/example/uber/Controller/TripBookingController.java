package com.example.uber.Controller;

import com.example.uber.Dto.TripBookingRequest;
import com.example.uber.Model.TripBooking;
import com.example.uber.Service.TripBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TripBooking")
public class TripBookingController {
@Autowired
    TripBookingService tripBookingService;
//@PostMapping("/Add")
//    public TripBooking add(@RequestBody TripBookingRequest tripBookingRequest){
//        return tripBookingService.insertBooking(tripBookingRequest);
//    }

}
