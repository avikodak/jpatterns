package com.avikodak.jpatterns.filter.impl;

import java.util.List;

import com.avikodak.jpatterns.filter.Criteria;

public class AndCriteria implements Criteria{

	private Criteria firstCriteria;
	private Criteria secondCriteria;
	
	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> result = firstCriteria.meetCriteria(persons);
		return secondCriteria.meetCriteria(result);
	}

}
