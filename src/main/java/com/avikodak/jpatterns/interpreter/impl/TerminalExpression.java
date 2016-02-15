package com.avikodak.jpatterns.interpreter.impl;

import com.avikodak.jpatterns.interpreter.Expression;

public class TerminalExpression implements Expression{
	
	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	public Boolean interpret(String context) {
		return data.contains(context);
	}
	
}
