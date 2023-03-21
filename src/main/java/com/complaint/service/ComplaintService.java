package com.complaint.service;

import java.util.ArrayList;
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
	
	public List<Complaint> getcomplaints(String cid) {
		List<Complaint> complaintList = new ArrayList<>();
		
		List<ComplaintEntity> entityList = complaintRepo.findByCid(cid);
		
		for(ComplaintEntity entity:entityList) {
			Complaint complaint = new Complaint();
			BeanUtils.copyProperties(entity, complaint);
			complaintList.add(complaint);
		}
		
		return complaintList;
	}
}
