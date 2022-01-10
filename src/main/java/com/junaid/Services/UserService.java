package com.junaid.Services;

import java.util.List;

import com.junaid.Models.UserModel;

public interface UserService {

	public List<UserModel> getUser();

	public List<UserModel> setUser(UserModel um);

	public List<UserModel> removeUser(long i);

	public UserModel getUserbyId(long parseLong);

	public UserModel putUser(long userid, UserModel um);

}