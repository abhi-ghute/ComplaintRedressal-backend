package com.complaint.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Feedback;
import com.complaint.entity.FeedbackEntity;
import com.complaint.repository.FeedbackRepo;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepo repo;
	
	public String saveFeedback(Feedback feedback) {
		
		FeedbackEntity entity = new FeedbackEntity();
		
		BeanUtils.copyProperties(feedback, entity);
		repo.save(entity);
		
		return "success";
	}
	
	public List<FeedbackEntity> getFeedbacks(String cid){
		System.out.println(cid);
		List<FeedbackEntity> entitList = repo.findByCid(cid);
		return entitList;
	}
}
