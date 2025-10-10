package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.ISHPlan;

@Repository
public interface ISHPlanRepository extends JpaRepository<ISHPlan, Long> {

}
