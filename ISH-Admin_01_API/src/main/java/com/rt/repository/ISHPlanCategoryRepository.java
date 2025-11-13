package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.rt.entity.ISHPlanCategory;

@Repository
public interface ISHPlanCategoryRepository extends JpaRepository<ISHPlanCategory, Long> {

}
