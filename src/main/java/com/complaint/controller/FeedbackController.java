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

import com.complaint.dto.Feedback;
import com.complaint.entity.FeedbackEntity;
import com.complaint.service.FeedbackService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("feedback")
public class FeedbackController {

	@Autowired
	FeedbackService service;
	
	@PostMapping("save")
	public String saveFeedback(@RequestBody Feedback feedback) {
		return service.saveFeedback(feedback);
	}
	
	@GetMapping("getFeedbacks")
	public List<FeedbackEntity> getFeedbacks(@RequestParam  String cid) {
		return service.getFeedbacks(cid);
	}
}
