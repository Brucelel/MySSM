package com.lel.service;
import org.springframework.stereotype.Service;

import com.lel.model.User;

public interface UserService {

	User selectUserById(Integer userId);
}
