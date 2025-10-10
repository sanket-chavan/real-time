package com.rt.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JRTP03_PLAN_MASTER")
@Getter
@Setter
public class ISHPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long planId;
	
	@Column(length=20, nullable = false)
	private String planName;
	
//	private LocalDate PLAN_START_DATE;
//	private LocalDate PLAN_END_DATE;
	
	private String description;
	
	private long planCategoryId;
	
	private char ActiveSw = 'a'; //active switch
	
	@Column(updatable = false, nullable = false)
	private LocalDate createdDate;
	
	private LocalDate updateDate;
	
	@Column(updatable = false, nullable = false)
	private String createdBy;
	
	private String updateBy;
	
}



/*
 * 
 * 
PLAN_ID
PLAN_NAME
PLAN_START_DATE
PLAN_END_DATE
DESCRIPTION
PLAN_CATEGORY_ID
ACTIVE_SW; //active switch
CREATE_DATE
UPDATE_DATE
CREATED_BY
UPDATED_BY
 * 
 * */
