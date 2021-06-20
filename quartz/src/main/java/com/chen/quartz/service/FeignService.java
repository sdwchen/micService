package com.chen.quartz.service;

import com.chen.user.entity.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "chen-user")
public interface FeignService {
    @GetMapping("/findAllAdmin")
    public AdminVO findAllAdmin();
}
