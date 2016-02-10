package com.avikodak.jpatterns.adaptor.impl;

import com.avikodak.jpatterns.adaptor.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer{

	public void playVLC(String fileName) {
	}

	public void playMP4(String fileName) {
		System.out.println("Playing from MP4 player "+ fileName);
	}

}
