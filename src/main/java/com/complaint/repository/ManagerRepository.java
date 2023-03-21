package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.ManagerEntity;

@Repository
public interface ManagerRepository extends JpaRepository<ManagerEntity, Integer>{

	public ManagerEntity findByemailAndPassword(String email, String password);
}
