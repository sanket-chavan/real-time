package com.rt.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "JRTP03_CITIZEN_APPLICATION")
public class CitizenAppRegistrationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long applicationId;
	
	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	private String gender;
	private String email;
	private String phoneNumber;
	private String ssn;
	private String stateName;
	
	private LocalDate dob;
	
	@Column(updatable = false, nullable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(nullable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@Column(updatable = false, nullable = false)
	private String createdBy;
	
	@Column(nullable = false)
	private String updateBy;
}
