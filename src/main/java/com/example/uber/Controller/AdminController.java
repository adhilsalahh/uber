package com.example.uber.Controller;

import com.example.uber.Model.Admin;
import com.example.uber.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping
    public Admin add(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }
    @PutMapping("/editPassword")
    public String editPassword(@RequestParam ("adminId")int adminId,
                     @RequestParam("password")String password){
        return adminService.editPassword(adminId,password);
     }
    @PutMapping("/editusername")
    public String editUserName(@RequestParam("adminId")int adminId,
                       @RequestParam("username")String username){
        return adminService.editusername(adminId,username);
    }


}
