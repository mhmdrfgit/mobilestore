package com.mhmdrf.mobilestore.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhmdrf.mobilestore.Dao.UserRepo;
import com.mhmdrf.mobilestore.Entity.User;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public String registerUser(User user) {
		String response;
		Optional<User> tempUser = userRepo.findByEmailId(user.getEmailId());
		if(tempUser.isPresent()) {
			String tempUsername = tempUser.get().getUserName();
			if(tempUsername.equals(user.getUserName())) {
				response = "User already exist !";
			}else {
				response = "User already exist with the user name :"+tempUsername;
			}
		}else {
			userRepo.save(user);
			response = "User Added";
		}
		return response;
	}
}
