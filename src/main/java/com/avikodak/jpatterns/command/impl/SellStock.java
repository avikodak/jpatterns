package com.avikodak.jpatterns.command.impl;

import com.avikodak.jpatterns.command.Order;

public class SellStock implements Order{
	
	private Stock stock;
	
	public SellStock(Stock stock) {
		super();
		this.stock = stock;
	}

	public void execute() {
		stock.sell();
	}

}
