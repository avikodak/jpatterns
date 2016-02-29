package com.avikodak.jpatterns.strategy.impl;

import com.avikodak.jpatterns.strategy.Strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int execute(int fOperand, int sOperand) {
		return strategy.doOperation(fOperand, sOperand);
	}
}
