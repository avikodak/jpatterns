package com.avikodak.jpatterns.adaptor.impl;

import com.avikodak.jpatterns.adaptor.MediaPlayer;
import com.avikodak.jpatterns.constants.MediaType;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;

	public void play(MediaType mediaType, String fileName) {
		if(MediaType.MP3 == mediaType){
			System.out.println("Playing from MP3 Player "+fileName);
		}else{
			mediaAdapter = new MediaAdapter(mediaType);
			mediaAdapter.play(mediaType, fileName);
		}
	}

}
