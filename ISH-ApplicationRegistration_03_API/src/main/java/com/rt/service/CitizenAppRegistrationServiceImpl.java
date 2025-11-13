package com.rt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.domain.CitizenAppRegistrationRequest;
import com.rt.entity.CitizenAppRegistrationEntity;
import com.rt.repository.CitizenAppRegistrationRepository;

@Service
public class CitizenAppRegistrationServiceImpl implements CitizenAppRegistrationService{

	@Autowired
	private CitizenAppRegistrationRepository citizenRegRepo;
	
	@Override
	public Long registerCitizenApplication(CitizenAppRegistrationRequest citizenAppRegistrationRequest) {
		CitizenAppRegistrationEntity citizenEntity = new CitizenAppRegistrationEntity();
		BeanUtils.copyProperties(citizenAppRegistrationRequest, citizenEntity);
		CitizenAppRegistrationEntity savedCitizen = citizenRegRepo.save(citizenEntity);
		
		return savedCitizen.getApplicationId();
	}

}
