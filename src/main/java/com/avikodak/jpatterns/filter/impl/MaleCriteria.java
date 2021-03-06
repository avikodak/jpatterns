package com.avikodak.jpatterns.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.avikodak.jpatterns.constants.Gender;
import com.avikodak.jpatterns.filter.Criteria;

public class MaleCriteria implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> result = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender() == Gender.MALE){
				result.add(person);
			}
		}
		return result;
	}

}
