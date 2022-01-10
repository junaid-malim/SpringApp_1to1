package com.junaid.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junaid.Models.UserModel;
import com.junaid.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<UserModel> getUser() {
		return userRepo.findAll();
	}

	@Override
	public List<UserModel> setUser(UserModel um) {
		userRepo.save(um);
		return getUser();
	}

	@Override
	public List<UserModel> removeUser(long parseLong) {
		userRepo.deleteById(parseLong);
		return getUser();
	}

	@Override
	public UserModel getUserbyId(long parseLong) {
		return userRepo.findById(parseLong).get();
	}

	@Override
	public UserModel putUser(long Userid, UserModel um) {
		removeUser(Userid);
		setUser(um);
		return getUserbyId(Userid);
	}
  
}
