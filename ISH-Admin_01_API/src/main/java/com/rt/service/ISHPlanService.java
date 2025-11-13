package com.rt.service;

import java.util.List;
import java.util.Map;

import com.rt.domain.ISHPlan;
import com.rt.entity.ISHPlanEntity;

public interface ISHPlanService {
	
	//save operation
	public String registerISHPlan(ISHPlan ishPlan);
	
	//for single selection
	public ISHPlanEntity showISHPlanById(long planId);

	public String updateISHPlan(ISHPlanEntity ishPlan);
	
	public List<ISHPlanEntity> showAllPlan();
	
	public String deleteISHPlan(Long planId);
	
	public Map<Long, String> getISHPlanCategories();
	
	public String changeISHPlanStatus(Long planId, String status);

}
