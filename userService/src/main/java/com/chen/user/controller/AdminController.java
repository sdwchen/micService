package com.chen.user.controller;


import com.chen.user.entity.AdminVO;
import com.chen.user.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class AdminController {
    private final static Logger log = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private AdminService adminService;

    @GetMapping("/findAllAdmin")
    public AdminVO findAllAdmin() {
        log.info("查询");
        AdminVO adminVO = adminService.findAllAdmin();

        System.out.println(adminVO);
        log.info("用户信息"+adminVO);
        return adminVO;

    }

    @GetMapping("/createAdmin")
    public void createAdmin(AdminVO adminVO) {
        System.out.println(adminVO);
        adminService.createAdmin(adminVO);
    }


}
