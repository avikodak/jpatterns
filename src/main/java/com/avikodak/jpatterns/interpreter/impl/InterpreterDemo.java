package com.avikodak.jpatterns.interpreter.impl;

import com.avikodak.jpatterns.interpreter.Expression;

public class InterpreterDemo {
	
	public static Expression getMaleExpression(){
		Expression fExpression = new TerminalExpression("John");
		Expression sExpression = new TerminalExpression("Robert");
		return new OrExpression(fExpression,sExpression);
	}
	
	public static Expression getMarriedExpression(){
		Expression fExpression = new TerminalExpression("Married");
		Expression sExpression = new TerminalExpression("Julie");
		return new OrExpression(fExpression,sExpression);
	}
	
}
