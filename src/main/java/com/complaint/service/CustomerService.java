package com.complaint.service;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Customer;
import com.complaint.entity.CustomerEntity;
import com.complaint.repository.CustomerRespository;

import jakarta.transaction.Transactional;

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
	
	public List<CustomerEntity> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	public CustomerEntity getCustomer(Integer id) {
		return customerRepo.findById(id).get();
	}
	
	@Transactional
	public String updateCustomer(CustomerEntity customer) {
		CustomerEntity entity = customerRepo.findById(customer.getId()).get();
		BeanUtils.copyProperties(customer, entity);
		
		return "success";
	}
	
	public String deleteCustomer(Integer id) {
		customerRepo.deleteById(id);
		return "Success";
	}
	
	
}
