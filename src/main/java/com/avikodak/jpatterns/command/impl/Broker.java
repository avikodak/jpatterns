package com.avikodak.jpatterns.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.avikodak.jpatterns.command.Order;

public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();

	public Broker() {
		super();
	}
	
	public void takeOrder(Order order){
		orderList.add(order);
	}
	
	public void placeOrder(){
		for (Order order : orderList) {
			order.execute();
		}
	}
}
