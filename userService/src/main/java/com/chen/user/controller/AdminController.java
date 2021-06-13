package com.chen.user.controller;


import com.chen.user.entity.AdminVO;
import com.chen.user.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

   // @GetMapping( value = "/findAllAdmin",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    @GetMapping("/findAllAdmin")
    public AdminVO findAllAdmin(){
        AdminVO adminVO =  adminService.findAllAdmin();

        System.out.println(adminVO);
        return adminVO;

    }


}
