package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.CustomerEntity;

@Repository
public interface CustomerRespository extends JpaRepository<CustomerEntity, Integer>{

	public CustomerEntity findByemailAndPassword(String email,String password);
}
