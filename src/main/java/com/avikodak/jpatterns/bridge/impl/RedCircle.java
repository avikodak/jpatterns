package com.avikodak.jpatterns.bridge.impl;

import com.avikodak.jpatterns.bridge.DrawAPI;

public class RedCircle implements DrawAPI{

	public void drawCircle(int x, int y, int radius) {
		System.out.println("Drawing red circle " + radius +"("+x+","+y+")");
	}

}
