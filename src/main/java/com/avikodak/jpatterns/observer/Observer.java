package com.avikodak.jpatterns.observer;

import com.avikodak.jpatterns.observer.impl.Subject;

public abstract class Observer {
	
	protected Subject subject;
	public abstract void update();
	
}
