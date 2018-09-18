package com.therealdanvega.repository;

import org.springframework.data.repository.CrudRepository;

import com.therealdanvega.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{
	
	
	
}
