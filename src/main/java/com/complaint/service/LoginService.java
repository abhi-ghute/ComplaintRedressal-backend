package com.complaint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Login;
import com.complaint.entity.AdministratorEntity;
import com.complaint.entity.CustomerEntity;
import com.complaint.entity.ManagerEntity;
import com.complaint.repository.AdministratorRepo;
import com.complaint.repository.CustomerRespository;
import com.complaint.repository.ManagerRepository;

@Service
public class LoginService {

	@Autowired
	AdministratorRepo adminRepo;
	
	@Autowired
	CustomerRespository customerRepo;
	
	@Autowired
	ManagerRepository managerRepo;
	
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
		else if(login.getRole().equalsIgnoreCase("manager")){
			ManagerEntity managerEntity = managerRepo.findByemailAndPassword(login.getUserName(), login.getPassword());
			if(managerEntity != null) {
				return managerEntity.getId()+"";
			}
		}
		
		return "failure";
	}
}
