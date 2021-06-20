package com.chen.user.dao;


import com.chen.user.entity.AdminVO;

import org.springframework.stereotype.Component;

@Component
public interface AdminMapper {

   AdminVO findAllAdmin();

   void createAdmin(AdminVO adminVO);

}