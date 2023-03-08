package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.AdministratorEntity;

@Repository
public interface AdministratorRepo extends JpaRepository<AdministratorEntity, Integer>{

	public AdministratorEntity findByUserNameAndPassword(String userName,String password);
}
