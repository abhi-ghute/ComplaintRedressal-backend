package com.complaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Manager;
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
}
