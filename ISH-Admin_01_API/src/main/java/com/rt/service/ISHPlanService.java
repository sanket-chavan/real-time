package com.rt.service;

import java.util.List;
import java.util.Map;

import com.rt.entity.ISHPlan;

public interface ISHPlanService {
	
	//save operation
	public String registerISHPlan(ISHPlan ishPlan);
	
	//for single selection
	public ISHPlan showISHPlanById(long planId);

	public String updateISHPlan(ISHPlan ishPlan);
	
	public List<ISHPlan> showAllPlan();
	
	public String deleteISHPlan(Long planId);
	
	public Map<Long, String> getISHPlanCategories();
	
	public String changeISHPlanStatus(Long planId, String status);

}
