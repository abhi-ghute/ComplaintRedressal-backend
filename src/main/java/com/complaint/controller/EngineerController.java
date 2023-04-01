package com.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Engineer;
import com.complaint.entity.EngineerEntity;
import com.complaint.service.EngineerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("engineer")
public class EngineerController {

	@Autowired
	EngineerService service;
	
	@PostMapping("create")
	public String createManager(@RequestBody Engineer engineer) {
		return service.createEngineer(engineer);
	}
	
	@GetMapping("getByPincode")
	public List<EngineerEntity> getByPincode(@RequestParam String pinCode){
		return service.getByPincode(pinCode);
	}
}
