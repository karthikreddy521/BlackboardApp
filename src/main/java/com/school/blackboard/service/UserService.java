package com.school.blackboard.service;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.blackboard.dao.UserDAO;
import com.school.blackboard.model.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;
	
	public List<User> getUserDetails()
	{
		
		return userDao.findAllUsers();
		
	}
	
	public User getUserDetailsById(int id)
	{
		
		return userDao.findUserById(id);
		
	}
	
	public void updateUser(User user)
	{
		
		userDao.updateUserById(user);
		
	}
	public void deleteUser(int id)
	{
		
		userDao.deleteUserById(id);
		
	}
	public void insertUser(User user)
	{
		
		userDao.insertUser(user);
		
	}
	
	
	
	
}
