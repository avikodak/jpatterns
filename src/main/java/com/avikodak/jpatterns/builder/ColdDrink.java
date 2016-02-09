package com.avikodak.jpatterns.builder;

import com.avikodak.jpatterns.builder.impl.Bottle;

public abstract class ColdDrink implements Item{
	
	public Packing packing(){
		return new Bottle();
	}
	
}
