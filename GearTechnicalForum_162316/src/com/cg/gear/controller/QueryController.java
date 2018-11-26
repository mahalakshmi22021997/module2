package com.cg.gear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gear.dto.Gear;
import com.cg.gear.service.IQueryService;

@Controller
public class QueryController {
	
	@Autowired
	IQueryService service;
	
	@RequestMapping(value="all",method = RequestMethod.GET)
	public String forum(){
		return "search";
	}
	
	
	@RequestMapping(value="dosearch",method=RequestMethod.GET)
	public ModelAndView gearSerach(@RequestParam("query_Id") int id,Gear gear){
	
		Gear gear2=null;
		gear2=service.searchQueryId(id);
		//
		 if (gear2 != null) {

			 return new ModelAndView("showDetails","sear",gear2);
      } else {
             return new ModelAndView("noDataFound");
      }
	}
	@RequestMapping(value="submiited",method = RequestMethod.GET)
	public String Success(){
		return "successPage";
	}
	@RequestMapping(value="home",method = RequestMethod.GET)
	public String First(){
		return "search";
	}
	
}
		

