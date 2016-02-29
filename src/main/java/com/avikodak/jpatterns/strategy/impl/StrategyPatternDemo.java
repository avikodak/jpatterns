package com.avikodak.jpatterns.strategy.impl;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new AddOperation());
		System.out.println(context.execute(10, 20));
		context.setStrategy(new SubtractionOperation());
		System.out.println(context.execute(10, 20));
		context.setStrategy(new MultiplicationOperation());
		System.out.println(context.execute(10, 20));
	}

}
