package com.avikodak.jpatterns.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.avikodak.jpatterns.constants.MartialStatus;
import com.avikodak.jpatterns.filter.Criteria;

public class MarriedCriteria implements Criteria{

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> result = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getMaritalStatus() == MartialStatus.MARRIED){
				result.add(person);
			}
		}
		return result;
	}
}
