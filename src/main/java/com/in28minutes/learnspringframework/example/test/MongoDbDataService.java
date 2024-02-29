package com.in28minutes.learnspringframework.example.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
@Repository
@Qualifier
public class MongoDbDataService implements DataService {
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}
		

}
