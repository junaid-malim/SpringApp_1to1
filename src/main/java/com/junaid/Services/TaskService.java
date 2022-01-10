package com.junaid.Services;

import java.util.List;

import com.junaid.Models.TaskModel;

public interface TaskService {

	public List<TaskModel> getTask();

	public List<TaskModel> setTask(TaskModel tm);

	public List<TaskModel> removeTask(long i);

	public TaskModel getTaskbyId(long parseLong);

	public TaskModel putTask(long taskid, TaskModel tm);
}