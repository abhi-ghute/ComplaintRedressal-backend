package com.complaint.dto;

import java.time.LocalDateTime;

public class Feedback {

	private String cid;
	private String role;
	private LocalDateTime currentDateTime = LocalDateTime.now();
	private String feedback;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
