package com.avikodak.jpatterns.bridge.impl;

import com.avikodak.jpatterns.bridge.DrawAPI;

public class GreenCircle implements DrawAPI{

	public void drawCircle(int x, int y, int radius) {
		System.out.println("Drawing green circle " + radius +"("+x+","+y+")");
	}

}
