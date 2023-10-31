package com.example.uber.Service;

import com.example.uber.Controller.DriverController;
import com.example.uber.Model.Driver;
import com.example.uber.Repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    DriverRepository driverRepository;
    public Driver insertdriver(String mobno,String password){
        Driver driver= new Driver();
        driver.setMobNo(mobno);
        driver.setPassword(password);
       return driverRepository.save(driver);

    }

}
