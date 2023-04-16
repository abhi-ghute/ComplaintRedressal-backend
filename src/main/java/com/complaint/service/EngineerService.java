package com.complaint.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.dto.Engineer;
import com.complaint.entity.EngineerEntity;
import com.complaint.repository.EngineerRepo;

import jakarta.transaction.Transactional;

@Service
public class EngineerService {

	@Autowired
	EngineerRepo repo;

	public String createEngineer(Engineer engineer) {

		EngineerEntity entity = new EngineerEntity();
		BeanUtils.copyProperties(engineer, entity);
		repo.save(entity);
		return "success";

	}

	public List<EngineerEntity> getByPincode(String pinCode) {
		List<EngineerEntity> entityList = repo.findAll();

		entityList = entityList.stream().filter(entity -> Arrays.asList(entity.getPincodes()).contains(pinCode))
				.collect(Collectors.toList());
		return entityList;
	}

	public List<EngineerEntity> getAll() {
		return repo.findAll();
	}

	@Transactional
	public String updateEngineer(EngineerEntity engineer) {
		System.out.println(engineer.getName());
		EngineerEntity entity = repo.findById(engineer.getId()).get();
		BeanUtils.copyProperties(engineer, entity);

		return "Success";
	}

	public String deleteEngineer(Integer id) {
		repo.deleteById(id);
		return "Success";
	}
}
