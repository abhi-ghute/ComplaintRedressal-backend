package com.complaint.service;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Complaint;
import com.complaint.entity.ComplaintEntity;
import com.complaint.repository.ComplaintRepository;

import jakarta.transaction.Transactional;

@Service
public class ComplaintService {

	@Autowired
	ComplaintRepository complaintRepo;
	
	public String saveComplaint(Complaint complaint) {
		ComplaintEntity entity = new ComplaintEntity();
		BeanUtils.copyProperties(complaint, entity);
		
		complaintRepo.save(entity);
		return "success";
	}
	
	public List<ComplaintEntity> getcomplaints(String status,String cid) {

		List<ComplaintEntity> entityList = complaintRepo.findByCidAndStatus(cid,status);
		
		return entityList;
	}
	
	public ComplaintEntity getComplaintById(Integer id) {
		return complaintRepo.findById(id).get();
	}
	
	public List<ComplaintEntity> getAllComplaints(String status) {

		List<ComplaintEntity> entityList = complaintRepo.findByStatus(status);
		
		return entityList;
	}
	
	@Transactional
	public String updateComplaint(ComplaintEntity complaint) {
		System.out.println(complaint.getId());
		ComplaintEntity entity = complaintRepo.findById(complaint.getId()).get();
		
		entity.setEid(complaint.getEid());
		entity.setStatus(complaint.getStatus());
		return "success";
	}
	
	public List<ComplaintEntity> getAllComplaintsByEngineer(String status,String eid) {

		List<ComplaintEntity> entityList = complaintRepo.findByStatusAndEid(status,eid);
		
		return entityList;
	}
}
