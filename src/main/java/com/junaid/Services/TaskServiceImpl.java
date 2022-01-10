package com.junaid.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junaid.Models.TaskModel;
import com.junaid.Repo.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public List<TaskModel> getTask() {
		return taskRepo.findAll();
	}

	@Override
	public List<TaskModel> setTask(TaskModel tm) {
		taskRepo.save(tm);
		return getTask();
	}

	@Override
	public List<TaskModel> removeTask(long parseLong) {
		taskRepo.deleteById(parseLong);
		return getTask();
	}

	@Override
	public TaskModel getTaskbyId(long parseLong) {
		return taskRepo.findById(parseLong).get();
	}

	@Override
	public TaskModel putTask(long taskid, TaskModel tm) {
		TaskModel taskModel=getTaskbyId(taskid);
		if(taskModel!=null) {
			taskModel.setTask_id(tm.getTask_id());
			taskModel.setName(tm.getName());
			taskModel.setDesc(tm.getDescr());
		}
		removeTask(taskid);
		setTask(taskModel);
		return taskModel;
	}
  
}
