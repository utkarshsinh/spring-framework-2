 package com.in28minutes.learnspringframework.example.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	@Autowired
	@Qualifier
	private DataService dataService;
	
	

//	public BusinessCalculationService(DataService dataService) {
//		super();
//		this.dataService = dataService;
//	}



	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}
		

}
