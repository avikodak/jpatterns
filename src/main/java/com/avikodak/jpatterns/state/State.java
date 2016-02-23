package com.avikodak.jpatterns.state;

import com.avikodak.jpatterns.state.impl.Context;

public interface State {
	
	public void doContext(Context context);
	
}
