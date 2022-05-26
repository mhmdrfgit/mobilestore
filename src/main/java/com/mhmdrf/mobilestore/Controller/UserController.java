package com.mhmdrf.mobilestore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mhmdrf.mobilestore.Entity.User;
import com.mhmdrf.mobilestore.Service.UserService;
import com.mhmdrf.mobilestore.Utility.UserUtilities;

@Controller
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserUtilities userUtil;
	
	@CrossOrigin
	@PostMapping(path="/registerUser")
	public @ResponseBody String RegisterUser(@RequestBody User user) {
		if(userUtil.EmailValidation(user.getEmailId()) && userUtil.UserNameValidation(user.getUserName())) {
			return userService.registerUser(user);
		}else
			return "Invalid Email Id or User Name";
		
	}
	
	@PostMapping(path="/loginUser")
	public @ResponseBody String LoginUser(@RequestBody User user) {
		return null;
	}
}
