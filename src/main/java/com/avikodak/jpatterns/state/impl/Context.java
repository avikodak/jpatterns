package com.avikodak.jpatterns.state.impl;

import com.avikodak.jpatterns.state.State;

public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
