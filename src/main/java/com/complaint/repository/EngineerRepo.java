package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.EngineerEntity;

@Repository
public interface EngineerRepo extends JpaRepository<EngineerEntity, Integer>{
	public EngineerEntity findByemailAndPassword(String email,String password);
}
