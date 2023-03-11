package com.complaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.dto.Customer;
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
}
