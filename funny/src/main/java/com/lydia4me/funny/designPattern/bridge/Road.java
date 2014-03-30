package com.lydia4me.funny.designPattern.bridge;

public abstract class Road {
	private Transport runnable;
	
	public Road(Transport runnable) {
		super();
		this.runnable = runnable;
	}

	public void run(){
		runnable.run();
	}
}
