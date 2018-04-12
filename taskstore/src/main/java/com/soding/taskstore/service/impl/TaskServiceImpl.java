package com.soding.taskstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soding.taskstore.dao.TaskDao;
import com.soding.taskstore.model.Task;
import com.soding.taskstore.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;

	@Transactional
	public void saveTask(Task task) {
		taskDao.saveTask(task);
	}

	@Transactional(readOnly = true)
	public List<Task> listTasks() {
		return taskDao.listTasks();
	}

	@Transactional(readOnly = true)
	public Task getTask(Long id) {
		return taskDao.getTask(id);
	}

	@Transactional
	public void deleteTask(Long id) {
		taskDao.deleteTask(id);

	}

}
