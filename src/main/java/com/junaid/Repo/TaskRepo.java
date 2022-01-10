package com.junaid.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.junaid.Models.TaskModel;


public interface TaskRepo extends JpaRepository<TaskModel, Long>{

	
	
}
