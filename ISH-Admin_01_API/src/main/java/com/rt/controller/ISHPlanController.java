package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.domain.ISHPlan;
import com.rt.service.ISHPlanServiceImpl;

@RestController
public class ISHPlanController {

	@Autowired
	private ISHPlanServiceImpl ishPlanSerImpl;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerPlan(ISHPlan ishPlan) {
		try {
			String registerISHPlan = ishPlanSerImpl.registerISHPlan(ishPlan);
			return new ResponseEntity<String>(registerISHPlan, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	/*
	 * {
  "planId": 0,
  "planName": "Child Health Plan",
  "description": "Child Health Plan",
  "planCategoryId": 1,
  "createdDate": "2025-10-08",
  "updateDate": "2025-10-08",
  "createdBy": "san",
  "updateBy": "san",
  "activeSw": "a"
}
	 * */
	
}
