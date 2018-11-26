package com.cg.gear.service;

import com.cg.gear.dto.Gear;


public interface IQueryService {
	
	public Gear searchQueryId(int id);
//	public boolean updateGear(Gear gear);
	boolean addQuery(Gear query_Master);

	
}
