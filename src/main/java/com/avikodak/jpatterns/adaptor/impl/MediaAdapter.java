package com.avikodak.jpatterns.adaptor.impl;

import com.avikodak.jpatterns.adaptor.AdvancedMediaPlayer;
import com.avikodak.jpatterns.adaptor.MediaPlayer;
import com.avikodak.jpatterns.constants.MediaType;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(MediaType type) {
		if(MediaType.VLC == type){
			advancedMediaPlayer = new VlcPlayer();
		}else{
			advancedMediaPlayer = new MP4Player();
		}
	}

	public void play(MediaType mediaType, String fileName) {
		if(MediaType.VLC == mediaType){
			advancedMediaPlayer.playVLC(fileName);
		}else{
			advancedMediaPlayer.playMP4(fileName);
		}
	}
	
}
