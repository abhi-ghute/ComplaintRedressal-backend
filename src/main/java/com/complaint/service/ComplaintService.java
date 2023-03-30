package com.complaint.service;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Complaint;
import com.complaint.entity.ComplaintEntity;
import com.complaint.repository.ComplaintRepository;

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
	
	public List<ComplaintEntity> getcomplaints(String cid) {

		List<ComplaintEntity> entityList = complaintRepo.findByCid(cid);
		
		return entityList;
	}
	
	public ComplaintEntity getComplaintById(Integer id) {
		return complaintRepo.findById(id).get();
	}
	
	public List<ComplaintEntity> getAllComplaints() {

		List<ComplaintEntity> entityList = complaintRepo.findAll();
		
		return entityList;
	}
	
}
