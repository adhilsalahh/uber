package com.example.uber.Controller;

import com.example.uber.Model.Driver;
import com.example.uber.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;
    @PostMapping("/add")
    public Driver add(@RequestParam ("mobNo")String mobNo,
                        @RequestParam("password")String password){
        return driverService.insertdriver(mobNo,password);
    }

}
