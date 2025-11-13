package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.CitizenAppRegistrationEntity;

@Repository
public interface CitizenAppRegistrationRepository extends JpaRepository<CitizenAppRegistrationEntity, Long> {

}
