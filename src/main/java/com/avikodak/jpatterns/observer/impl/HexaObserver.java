package com.avikodak.jpatterns.observer.impl;

import com.avikodak.jpatterns.observer.Observer;

public class HexaObserver extends Observer{

	public HexaObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		System.out.println( "Hexa Decimal String: " + Integer.toHexString(subject.getState() ) );		
	}

}
