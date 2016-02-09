package com.avikodak.jpatterns.builder;

import com.avikodak.jpatterns.builder.impl.Wrapper;

public abstract class Burger implements Item{
	
	public Packing packing(){
		return new Wrapper();
	}
	
}
