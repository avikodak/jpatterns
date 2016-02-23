package com.avikodak.jpatterns.state.impl;

import com.avikodak.jpatterns.state.State;

public class EndState implements State {

	public void doContext(Context context) {
		System.out.println("End state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "End State";
	}

}
