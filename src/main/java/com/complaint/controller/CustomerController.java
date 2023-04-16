package com.complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Complaint;
import com.complaint.dto.Customer;
import com.complaint.entity.CustomerEntity;
import com.complaint.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping("create")
	public String createCustomer(@RequestBody Customer customer) {
		
		System.out.println(customer.getPincode());
		return service.createCustomer(customer);
	}
	
	@GetMapping("getAll")
	public List<CustomerEntity> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping
	public CustomerEntity getCustomer(@RequestParam Integer id) {
		return service.getCustomer(id);
	}
	
	@PostMapping("update")
	public String updateCustomer(@RequestBody CustomerEntity customer) {
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("delete")
	public String deleteCustomer(@RequestParam Integer id) {
		return service.deleteCustomer(id);
	}
}
