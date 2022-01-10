package com.junaid.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.junaid.Models.UserModel;
import com.junaid.Services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/api/Users")
	public List<UserModel> Users(){
		return userService.getUser();
	}

	@GetMapping("/Users/{Userid}")
	public UserModel Users(@PathVariable String Userid){
		return userService.getUserbyId(Long.parseLong(Userid));
	}

	@PostMapping("/Users")
	public List<UserModel> addUsers(@RequestBody UserModel um){
		return userService.setUser(um);
	}

	@PutMapping("/Users/{Userid}")
	public UserModel putUser(@PathVariable String Userid,@RequestBody UserModel um){
		return userService.putUser(Long.parseLong(Userid),um);
	}

	@DeleteMapping("/Users/{Userid}")
	public List<UserModel> deleteUser(@PathVariable String Userid){
		return userService.removeUser(Long.parseLong(Userid));
	}

}