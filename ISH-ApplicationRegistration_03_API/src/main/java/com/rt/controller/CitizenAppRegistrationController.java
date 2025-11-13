package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.domain.CitizenAppRegistrationRequest;
import com.rt.service.CitizenAppRegistrationServiceImpl;

@RestController
public class CitizenAppRegistrationController {
	
	@Autowired
	private CitizenAppRegistrationServiceImpl citizenSerImpl;
	
	@PostMapping("/register-citizen-info")
	public ResponseEntity<String> registerCitizen(CitizenAppRegistrationRequest req) {
		System.out.println(req);
		Long registerCitizenApplication = citizenSerImpl.registerCitizenApplication(req);
		return ResponseEntity.ok(registerCitizenApplication + " registered successfully!!");
	}
		
}

//when webappln(i.e. ui is also handling) then we use @controller, but now here is webservice(ie we are only concerned with data not ui) then we use @restcontroller

//responseEntity converts java object into json format
