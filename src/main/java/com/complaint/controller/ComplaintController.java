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

import com.complaint.dto.Complaint;
import com.complaint.service.ComplaintService;

@RestController
@RequestMapping("complaint")
@CrossOrigin(origins = "http://localhost:4200")
public class ComplaintController {

	@Autowired
	ComplaintService service;
	
	@PostMapping("save")
	public String saveComplaint(@RequestBody Complaint complaint) {
		System.out.println(complaint.getMobile());
		return service.saveComplaint(complaint);
	}
	
	@GetMapping("list")
	public List<Complaint> getComplaints(@RequestParam String cid) {
		return service.getcomplaints(cid);
	}
}
