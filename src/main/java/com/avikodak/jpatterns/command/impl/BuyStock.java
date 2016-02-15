package com.avikodak.jpatterns.command.impl;

import com.avikodak.jpatterns.command.Order;

public class BuyStock implements Order{
	
	private Stock stock;
	
	public BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}

	public void execute() {
		stock.sell();
	}

}
