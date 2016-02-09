package com.avikodak.jpatterns.builder.impl;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal vegMeal = new Meal();
		vegMeal.items.add(new VegBurger());
		vegMeal.items.add(new Coke());
		return vegMeal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal nonVegMeal = new Meal();
		nonVegMeal.items.add(new ChickenBurger());
		nonVegMeal.items.add(new Pepsi());
		return nonVegMeal;
	}
	
}
	