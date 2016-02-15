package com.avikodak.jpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.avikodak.jpatterns.observer.Observer;

public class Subject {

	private int state;
	List<Observer> observers = new ArrayList<Observer>();

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void attachObserver(Observer observer){
		observers.add(observer);
	}
}
