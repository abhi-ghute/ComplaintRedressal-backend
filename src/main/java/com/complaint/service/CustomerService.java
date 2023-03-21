package com.complaint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Complaint;
import com.complaint.dto.Customer;
import com.complaint.entity.ComplaintEntity;
import com.complaint.entity.CustomerEntity;
import com.complaint.repository.ComplaintRepository;
import com.complaint.repository.CustomerRespository;

@Service
public class CustomerService {

	@Autowired
	CustomerRespository customerRepo;
	
	public String createCustomer(Customer customer) {
		
		CustomerEntity entity = new CustomerEntity();
		BeanUtils.copyProperties(customer, entity);
		
		customerRepo.save(entity);
		return "success";
	}
}
