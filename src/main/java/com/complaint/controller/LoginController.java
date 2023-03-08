package com.complaint.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Login;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@PostMapping("login")
	public String login(@RequestBody Login login) {
		return "done";
	}
}
