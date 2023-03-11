package com.complaint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String mobile;
	private String password;
	private String mobileService;
	private String landLineService;
	private String broadbandService;
	private String address;
	private String state;
	private String city;
	private String pincode;
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileService() {
		return mobileService;
	}
	public void setMobileService(String mobileService) {
		this.mobileService = mobileService;
	}
	public String getLandLineService() {
		return landLineService;
	}
	public void setLandLineService(String landLineService) {
		this.landLineService = landLineService;
	}
	public String getBroadbandService() {
		return broadbandService;
	}
	public void setBroadbandService(String broadbandService) {
		this.broadbandService = broadbandService;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPincode() {
		return pincode;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
}
