package com.avikodak.jpatterns.singelton;

public final class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	private SingleObject(){};
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello World !!");
	}
}
