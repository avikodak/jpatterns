package com.avikodak.jpatterns.observer.impl;

import com.avikodak.jpatterns.observer.Observer;

public class OctalObserver extends Observer{

	public OctalObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString(subject.getState() ) );		
	}

}
