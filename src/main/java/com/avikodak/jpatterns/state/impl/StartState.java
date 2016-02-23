package com.avikodak.jpatterns.state.impl;

import com.avikodak.jpatterns.state.State;

public class StartState implements State {

	public void doContext(Context context) {
		System.out.println("In start state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State";
	}

}
