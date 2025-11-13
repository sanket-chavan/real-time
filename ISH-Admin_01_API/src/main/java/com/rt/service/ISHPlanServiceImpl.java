package com.rt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.domain.ISHPlan;
import com.rt.entity.ISHPlanEntity;
import com.rt.repository.ISHPlanRepository;

@Service
public class ISHPlanServiceImpl implements ISHPlanService{
	
	@Autowired
	private ISHPlanRepository ishPlanRepository;

	@Override
	public String registerISHPlan(ISHPlan ishPlan) {
		ISHPlanEntity ishPlan1 = new ISHPlanEntity();
		
		BeanUtils.copyProperties(ishPlan, ishPlan1);
		
		ISHPlanEntity savedPlan = ishPlanRepository.save(ishPlan1);
		return savedPlan.getPlanId()+ "Registered successfully...!";
	}

	@Override
	public ISHPlanEntity showISHPlanById(long planId) {
		
		return null;
	}

	@Override
	public String updateISHPlan(ISHPlanEntity ishPlan) {
		
		return null;
	}

	@Override
	public List<ISHPlanEntity> showAllPlan() {
		List<ISHPlanEntity> allPlans = ishPlanRepository.findAll();
		return allPlans;
	}

	@Override
	public String deleteISHPlan(Long planId) {
		
		return null;
	}

	@Override
	public Map<Long, String> getISHPlanCategories() {
		
		return null;
	}

	@Override
	public String changeISHPlanStatus(Long planId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

}
