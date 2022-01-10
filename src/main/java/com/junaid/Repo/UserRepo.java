package com.junaid.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.junaid.Models.UserModel;


public interface UserRepo extends JpaRepository<UserModel, Long>{
	
}
