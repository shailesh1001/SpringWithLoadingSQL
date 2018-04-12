package com.soding.taskstore.dao;

import java.util.List;


import com.soding.taskstore.model.Task;

public interface TaskDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveTask(Task task); // create and update

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
