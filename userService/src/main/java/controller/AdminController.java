package controller;

import entity.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AdminService;
import service.impl.AdminServiceImpl;

@RestController
public class AdminController {


    private AdminService adminService;

    @GetMapping(value = "/findAllAdmin")
    public AdminVO findAllAdmin(){
        System.out.printf("a");
        return adminService.findAllAdmin();

    }

    @Autowired
    private void setAdminService(AdminServiceImpl adminService){
        this.adminService=adminService;
    }
}
