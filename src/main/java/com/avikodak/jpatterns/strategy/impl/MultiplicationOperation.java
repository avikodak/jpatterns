package com.avikodak.jpatterns.strategy.impl;

import com.avikodak.jpatterns.strategy.Strategy;

public class MultiplicationOperation implements Strategy {

	public int doOperation(int fOperand, int sOperand) {
		return fOperand * sOperand;
	}

}
