package com.lel.service;

import com.lel.model.User;
import com.lel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lel.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired  
    private UserDao userDao;  

	@Override
    public User selectUserById(Integer userId) {  
		return userDao.selectUserById(userId);
    }  

}
