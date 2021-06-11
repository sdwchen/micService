package com.chen.user.controller;


import com.chen.user.entity.AdminVO;
import com.chen.user.service.AdminService;
import com.chen.user.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {


    private AdminService adminService;

    @GetMapping(value = "/findAllAdmin")
    public AdminVO findAllAdmin(){

        return adminService.findAllAdmin();

    }

    @Autowired
    private void setAdminService(AdminServiceImpl adminService){
        this.adminService=adminService;
    }
}
