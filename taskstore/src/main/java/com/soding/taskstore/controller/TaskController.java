package com.soding.taskstore.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.soding.taskstore.model.Task;
import com.soding.taskstore.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	private TaskService taskService;

	@RequestMapping(value = "/")
	public String welcomePage(Map<String, Object> map) {

		map.put("task", new Task());
		map.put("taskList", taskService.listTasks());

		return "/book/listTasks";
	}

	@RequestMapping("/get/{taskId}")
	public String getBook(@PathVariable Long taskId, Map<String, Object> map,ModelMap model) {
		Task task = taskService.getTask(taskId);
		map.put("task", task);
		return "/book/bookForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveTask(@RequestParam String name, @RequestParam String description, @RequestParam("id") Long taskId) {
		Task task = new Task();
		if (taskId != null) {
			task.setId(taskId);
			task.setDateUpated(new Date());
		}
		task.setDateCreated(new Date());
		task.setDescription(description);
		task.setName(name);
		taskService.saveTask(task);
		return "redirect:/";
	}

	@RequestMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") Long id) {
		taskService.deleteTask(id);
		return "redirect:/";
	}
}
