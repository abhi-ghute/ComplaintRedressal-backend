package com.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Manager;
import com.complaint.entity.ManagerEntity;
import com.complaint.service.ManagerService;

@RestController
@RequestMapping("manager")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerController {

	@Autowired
	ManagerService service;
	
	@PostMapping("create")
	public String createManager(@RequestBody Manager manager) {
		return service.createManager(manager);
	}
	
	@GetMapping("getAll")
	public List<ManagerEntity> getAll(){
		return service.getAll();
	}
	
	@PostMapping("update")
	public String updateManager(@RequestBody ManagerEntity manager) {
		return service.updateManager(manager);
	}
	
	@DeleteMapping("delete")
	public String deleteManager(@RequestParam Integer id) {
		return service.deleteManager(id);
	}
}
