package com.avikodak.jpatterns.interpreter.impl;

import com.avikodak.jpatterns.interpreter.Expression;

public class AndExpression implements Expression{
	
	private Expression fExpression;
	private Expression sExpression;
	
	public AndExpression(Expression fExpression, Expression sExpression) {
		super();
		this.fExpression = fExpression;
		this.sExpression = sExpression;
	}

	public Boolean interpret(String context) {
		return fExpression.interpret(context) && sExpression.interpret(context);
	}
	
}
