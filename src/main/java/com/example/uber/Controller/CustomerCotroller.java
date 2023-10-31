package com.example.uber.Controller;

import com.example.uber.Exception.CustomerErrorException;
import com.example.uber.Model.Customer;
import com.example.uber.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerCotroller {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity add (@RequestBody Customer customer){
        try{
            Customer customer1=customerService.insertCustomer(customer);
            return new ResponseEntity<>(customer1, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity<>("Error adding customer",HttpStatus.BAD_REQUEST);
        }
    }

}
