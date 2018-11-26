package com.cg.gear.dao;

import com.cg.gear.dto.Gear;


public interface IQueryDao {
	
	public Gear searchQueryId(int id);
	//public boolean updateGear(Gear gear);
	boolean addQuery(Gear query_Master);
	
}
