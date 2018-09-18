package com.therealdanvega.service;

import org.springframework.stereotype.Service;

import com.therealdanvega.domain.Task;
import com.therealdanvega.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;
	
	//@Autowired	// elvileg Spring 4.3 után nem kell már az @Autowired annotáció... majd kiderül
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		return this.taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		return this.taskRepository.save(task);
	}

}
