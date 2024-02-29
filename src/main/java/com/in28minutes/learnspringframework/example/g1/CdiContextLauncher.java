package com.in28minutes.learnspringframework.example.g1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class BusinessService{
	DataService dataservice;

	public DataService getDataservice() {
		return dataservice;
	}
//	@Autowired
	@Inject
	public void setDataservice(DataService dataservice) {
		System.out.println("Setter Injection");
		this.dataservice = dataservice;
	}
	
}

@Component
class DataService {
	
}

@Configuration
@ComponentScan
public class CdiContextLauncher {
	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncher.class)){
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			System.out.println(context.getBean(BusinessService.class).getDataservice());
		}


	}

}
