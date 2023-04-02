package com.complaint.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Manager;
import com.complaint.entity.ManagerEntity;
import com.complaint.repository.ManagerRepository;

@Service
public class ManagerService {

	@Autowired
	ManagerRepository repo;
	
	public String createManager(Manager manager) {
		
		ManagerEntity entity = new ManagerEntity();
		BeanUtils.copyProperties(manager, entity);
		
		repo.save(entity);
		return "success";
	}
	public List<ManagerEntity> getAll(){
		return repo.findAll();
	}
}
