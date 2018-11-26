package com.cg.gear.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="query_master1")
public class Gear {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int query_Id;
	
	@Column(name="technology")
	private String technology;
	
	@Column(name="query_raised_by")
	private String query_Raised_By;
	
	@Column(name="query")
	private String query;
	
	@Column(name="solutions")
	private String solutions;
	
	@Column(name="solution_given_by")
	private String solution_Given_By;

	public int getQuery_Id() {
		return query_Id;
	}

	public void setQuery_Id(int query_Id) {
		this.query_Id = query_Id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQuery_Raised_By() {
		return query_Raised_By;
	}

	public void setQuery_Raised_By(String query_Raised_By) {
		this.query_Raised_By = query_Raised_By;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolution_Given_By() {
		return solution_Given_By;
	}

	public void setSolution_Given_By(String solution_Given_By) {
		this.solution_Given_By = solution_Given_By;
	}

	@Override
	public String toString() {
		return "Gear [query_Id=" + query_Id + ", technology=" + technology
				+ ", query_Raised_By=" + query_Raised_By + ", query=" + query
				+ ", solutions=" + solutions + ", solution_Given_By="
				+ solution_Given_By + "]";
	}
	
	

}
