package com.avikodak.jpatterns.memento;

public class Originator {

	private String state;

	public Originator() {
		super();
	}

	public Originator(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
