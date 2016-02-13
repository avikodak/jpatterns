package com.avikodak.jpatterns.filter.impl;

import com.avikodak.jpatterns.constants.Gender;
import com.avikodak.jpatterns.constants.MartialStatus;

public class Person {

	private Gender gender;
	private MartialStatus maritalStatus;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MartialStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MartialStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

}
