package com.rt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.ISHPlan;
import com.rt.repository.ISHPlanRepository;

@Service
public class ISHPlanServiceImpl implements ISHPlanService{
	
	@Autowired
	private ISHPlanRepository ishPlanRepository;

	@Override
	public String registerISHPlan(ISHPlan ishPlan) {
		ISHPlan savedPlan = ishPlanRepository.save(ishPlan);
		return savedPlan.getPlanId()+ "Registered successfully...!";
	}

	@Override
	public ISHPlan showISHPlanById(long planId) {
		
		return null;
	}

	@Override
	public String updateISHPlan(ISHPlan ishPlan) {
		
		return null;
	}

	@Override
	public List<ISHPlan> showAllPlan() {
		List<ISHPlan> allPlans = ishPlanRepository.findAll();
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
