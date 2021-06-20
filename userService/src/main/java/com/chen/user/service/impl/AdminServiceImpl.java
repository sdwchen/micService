package com.chen.user.service.impl;


import com.chen.user.dao.AdminMapper;

import com.chen.user.entity.AdminVO;
import com.chen.user.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    private AdminMapper adminMapper;

    public AdminVO findAllAdmin(){
        return adminMapper.findAllAdmin();
    }

    @Override public void createAdmin(AdminVO adminVO) {
         System.out.println(adminVO);
         adminMapper.createAdmin(adminVO);
    }

    @Autowired
    public void setUserDao (AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }
}
