package com.avikodak.jpatterns.filter.impl;

import java.util.List;

import com.avikodak.jpatterns.filter.Criteria;

public class OrCriteria implements Criteria{

	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> result = firstCriteria.meetCriteria(persons);
		for (Person person : secondCriteria.meetCriteria(persons)) {
			if(!result.contains(person)){
				result.add(person);
			}
		}
		return result;
	}

}
