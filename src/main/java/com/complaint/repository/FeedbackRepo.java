package com.complaint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complaint.entity.FeedbackEntity;

@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackEntity, Integer>{

	public List<FeedbackEntity> findByCid(String cid);
}
