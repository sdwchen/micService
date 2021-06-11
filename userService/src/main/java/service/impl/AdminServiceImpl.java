package service.impl;


import dao.AdminMapper;
import entity.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminMapper adminMapper;

    public AdminVO findAllAdmin(){
        return adminMapper.findAllAdmin();
    }

    @Autowired
    public void setUserDao (AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }
}
