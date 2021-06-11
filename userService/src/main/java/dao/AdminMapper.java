package dao;


import entity.AdminVO;
import org.springframework.stereotype.Component;

@Component
public interface AdminMapper {

   AdminVO findAllAdmin();

}