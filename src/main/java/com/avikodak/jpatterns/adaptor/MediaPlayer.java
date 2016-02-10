package com.avikodak.jpatterns.adaptor;

import com.avikodak.jpatterns.constants.MediaType;

public interface MediaPlayer {
	
	public void play(MediaType mediaType,String fileName);
	
}
