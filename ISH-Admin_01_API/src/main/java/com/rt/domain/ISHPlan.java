package com.rt.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ISHPlan {

	private String planName;
	
	private String description;
	
	private long planCategoryId;
	
	private char ActiveSw; //active switch
	
	
		
}
