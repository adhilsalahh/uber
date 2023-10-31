package com.example.uber.Service;

import com.example.uber.Model.Customer;
import com.example.uber.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer insertCustomer(Customer customer){

        Customer customer1=new Customer();
        customer1.setPassword(customer.getPassword());
        customer1.setMobNo(customer.getMobNo());

        return customerRepository.save(customer1);
    }

}