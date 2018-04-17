package com.lel.test.service;
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;
import com.lel.model.User;
import com.lel.service.UserService;
import com.lel.test.SpringTestCase;

public class UserServiceTest extends SpringTestCase {

	@Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}
