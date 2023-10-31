package com.example.uber.Service;

import com.example.uber.Model.Admin;
import com.example.uber.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;
    public Admin addAdmin( Admin admin){
        return adminRepository.save(admin);
    }

    public String editPassword(int id,String password){
        Admin admin=adminRepository.findById(id).get();
        admin.setPassword(password);
        adminRepository.save(admin);
        return "Successfull ";
    }
    public String editusername(int id ,String username){
        Admin admin=adminRepository.findById(id).get();
        String oldname=admin.getUsername();
        admin.setUsername(username);
        Admin savedadmin=adminRepository.save(admin);
        return "successfull"+ savedadmin.getUsername();

    }





}
