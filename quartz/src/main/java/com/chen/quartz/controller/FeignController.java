package com.chen.quartz.controller;

import com.chen.quartz.service.FeignService;
import com.chen.user.entity.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/findAllAdmin")
    public AdminVO findAllAdmin(){
      return   feignService.findAllAdmin();
    }
}
