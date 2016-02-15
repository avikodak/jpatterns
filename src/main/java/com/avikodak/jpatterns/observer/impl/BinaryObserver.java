package com.avikodak.jpatterns.observer.impl;

import com.avikodak.jpatterns.observer.Observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject){
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );		
	}
	
}
