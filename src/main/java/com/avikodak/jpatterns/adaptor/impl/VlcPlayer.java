package com.avikodak.jpatterns.adaptor.impl;

import com.avikodak.jpatterns.adaptor.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	public void playVLC(String fileName) {
		System.out.println("Playing from VLC " + fileName);
	}

	public void playMP4(String fileName) {
		
	}

}
