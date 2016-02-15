package com.avikodak.jpatterns.command.impl;

public class Stock {
	
	private String name;
	private int quantity;
	
	public void buy(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}
	
	public void sell(){
		System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	}
}
