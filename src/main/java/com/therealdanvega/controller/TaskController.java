package com.therealdanvega.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.therealdanvega.domain.Task;
import com.therealdanvega.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private TaskService taskService;

	// nem rakjuk ki az @Autowired annotációt... magyarázat: TaskServiceImpl-ben
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}

	@GetMapping( value = {"", "/"} ) // ket lehetoseg van
	public Iterable<Task> list() {
		return taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}
	
}
