package com.soding.taskstore.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soding.taskstore.dao.TaskDao;

import com.soding.taskstore.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveTask(Task task) {
		getSession().merge(task);

	}

	@SuppressWarnings("unchecked")
	public List<Task> listTasks() {

		return getSession().createCriteria(Task.class).list();
	}

	public Task getTask(Long id) {
		return (Task) getSession().get(Task.class, id);
	}

	public void deleteTask(Long id) {

		Task task = getTask(id);

		if (null != task) {
			getSession().delete(task);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
