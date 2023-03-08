package com.complaint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Login;
import com.complaint.entity.AdministratorEntity;
import com.complaint.repository.AdministratorRepo;

@Service
public class LoginService {

	@Autowired
	AdministratorRepo adminRepo;
	
	public String login(Login login) {
		
		if(login.getRole().equalsIgnoreCase("admin")) {
			AdministratorEntity administratorEntity = adminRepo.findByUserNameAndPassword(login.getUserName(),login.getPassword());
			if(administratorEntity != null) {
				return login.getUserName();
			}
		}
		return "failure";
	}
}
