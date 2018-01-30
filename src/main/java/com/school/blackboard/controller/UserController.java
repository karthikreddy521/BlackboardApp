package com.school.blackboard.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.blackboard.model.User;
import com.school.blackboard.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired 
	UserService userService;
 
@RequestMapping(value="",method=RequestMethod.GET)
@ResponseBody
  public List<User> getAllUsers(Model model){
	return userService.getUserDetails();
    
  }

@RequestMapping(value="/{userId}",method=RequestMethod.GET)
@ResponseBody
public User getUserById(@PathVariable int userId){
  return userService.getUserDetailsById(userId);
}

@RequestMapping(value="/{userId}",method=RequestMethod.POST)
public void updateUser(@PathVariable int userId,@RequestBody User user ){
   userService.updateUser(user);
}
@RequestMapping(value="/{userId}",method=RequestMethod.DELETE)
public void deleteUser(@PathVariable int userId){
   userService.deleteUser(userId);
}
@RequestMapping(value="",method=RequestMethod.POST)
public void insertUser(@RequestBody User user ){
   userService.insertUser(user);
}


}

