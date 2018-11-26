package com.cg.gear.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.gear.dto.Gear;

@Repository
public class QueryDaoImpl implements IQueryDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Gear searchQueryId(int id) {
		  Gear gear = null;
	         //  Query querySearch = entitymanager.createQuery("From Employee");
	           gear = entityManager.find(Gear.class, id);
	           return gear;
	}

	
	/*public boolean updateGear(Gear gear) {
		boolean result=false;
        int id=gear.getQuery_Id();
        Gear gear2 = entityManager.find(Gear.class,id);
       entityManager.merge(gear2);
       result=true;
        return result;
	}*/
	@Override
	public boolean addQuery(Gear query_Master) {
		// TODO Auto-generated method stub
		
		entityManager.merge(query_Master);
		entityManager.flush();
		return true;
	}
}
