package com.cg.gear.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.gear.dao.IQueryDao;
import com.cg.gear.dto.Gear;


@Service
@Transactional
public class QueryServiceImpl implements IQueryService {
	@Autowired
	IQueryDao dao;

	@Override
	public Gear searchQueryId(int id) {
		// TODO Auto-generated method stub
		return dao.searchQueryId(id);
	}

	
	@Override
	public boolean addQuery(Gear query_Master) {
		// TODO Auto-generated method stub
		return false;
	}

}
