package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.ComplaintEntity;

@Repository
public interface ComplaintRepository extends JpaRepository<ComplaintEntity, Integer>{

	public List<ComplaintEntity> findByCidAndStatus(String cid,String status);
	
	public List<ComplaintEntity> findByStatus(String status);
	
	public List<ComplaintEntity> findByStatusAndEid(String status,String eid);
}
