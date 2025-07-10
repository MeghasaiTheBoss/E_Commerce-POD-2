package com.pod2.Ecommerce.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pod2.Ecommerce.Entities.Role;
import com.pod2.Ecommerce.Entities.User;
import com.pod2.Ecommerce.Services.userService;



@Controller

@RestController
@RequestMapping("/user")
public class userController 
{
	@Autowired
	private userService userService;  

	@RequestMapping("/register")
	
	public void registerUser(@RequestBody User user)
	{
		user.setRole(Role.USER);
		userService.addUser(user);
	}
	
	public void loginUser(String username, String password)
	{
		//code to login the user
	}
	
	public Map getuserProfile(int user_Id)
	{
		return null;
		//code to get user profile
	}
	
	public String updateUserProfile(int user_Id, HashMap userData)
	{
		return null;
		//code to update the user's profile
	}
}
