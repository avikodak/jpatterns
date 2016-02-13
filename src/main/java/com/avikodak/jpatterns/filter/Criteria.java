package com.avikodak.jpatterns.filter;

import java.util.List;

import com.avikodak.jpatterns.filter.impl.Person;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);
}
