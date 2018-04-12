package com.soding.taskstore.service;

import java.util.List;

import com.soding.taskstore.model.Task;

public interface TaskService {

	/*
	 * CREATE and UPDATE
	 */
	public void saveTask(Task task);

	/*
	 * READ
	 */
	public List<Task> listTasks();

	public Task getTask(Long id);

	/*
	 * DELETE
	 */
	public void deleteTask(Long id);

}
