package com.complaint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Login;
import com.complaint.entity.AdministratorEntity;
import com.complaint.entity.CustomerEntity;
import com.complaint.repository.AdministratorRepo;
import com.complaint.repository.CustomerRespository;

@Service
public class LoginService {

	@Autowired
	AdministratorRepo adminRepo;
	
	@Autowired
	CustomerRespository customerRepo;
	
	public String login(Login login) {
		
		if(login.getRole().equalsIgnoreCase("admin")) {
			AdministratorEntity administratorEntity = adminRepo.findByUserNameAndPassword(login.getUserName(),login.getPassword());
			if(administratorEntity != null) {
				return login.getUserName();
			}
		}else if(login.getRole().equalsIgnoreCase("customer")){
			CustomerEntity customerEntity = customerRepo.findByemailAndPassword(login.getUserName(), login.getPassword());
			if(customerEntity != null) {
				return customerEntity.getId()+"";
			}
		}
		return "failure";
	}
}
