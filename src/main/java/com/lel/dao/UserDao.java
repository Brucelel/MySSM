package com.lel.dao;
import com.lel.model.User;

public interface UserDao {

	public User selectUserById(Integer userId);
}
