package com.school.blackboard.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.school.blackboard.dao.UserDAO;
import com.school.blackboard.model.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@Mock
	UserDAO mockUserDao;
	
	@InjectMocks
	UserService mockUserService;
	
	@Test
	public void findAllUsersTest() {
		User testUser=new User(100,"Harish","Vempati","R",new Date(0),"kk@villa.edu","","34341",true,1); 
		User testUser1=new User(101,"Harish","Vempati","R",new Date(0),"kk@villa.edu","","34341",true,1); 
		
	 	
		List<User> list = new ArrayList<User>();
		list.add(testUser);
		list.add(testUser1);
		when(mockUserDao.findAllUsers()).thenReturn(list);
		
		List<User> list1 = mockUserService.getUserDetails();
		assertEquals(list,list1);
	}
	
	@Test
	public void findUserByIdWhenIdIsPresent() {
		User testUser=new User(100,"Harish","Vempati","R",new Date(0),"kk@villa.edu","","34341",true,1); 
		
	
		when(mockUserDao.findUserById(testUser.getUserId())).thenReturn(testUser);
		
		User res = mockUserService.getUserDetailsById(testUser.getUserId());
		assertNotNull(res);
	}
	
	@Test
	public void findUserByIdWhenIdNotPresent() {
		User testUser=new User(100,"Harish","Vempati","R",new Date(0),"kk@villa.edu","","34341",true,1); 
		
		when(mockUserDao.findUserById(200)).thenReturn(null);
		
		User res = mockUserService.getUserDetailsById(200);
		assertNull(res);
	}

}
