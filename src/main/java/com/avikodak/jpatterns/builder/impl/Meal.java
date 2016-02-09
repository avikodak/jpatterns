package com.avikodak.jpatterns.builder.impl;

import java.util.ArrayList;
import java.util.List;

import com.avikodak.jpatterns.builder.Item;

public class Meal {
	
	List<Item> items = new ArrayList<Item>();
	
	public void showItems(){
		for (Item item : items) {
			System.out.println(item.name());
		}
	}
	
	public float price(){
		float totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.price();
		}
		return totalPrice;
	}
	
}
