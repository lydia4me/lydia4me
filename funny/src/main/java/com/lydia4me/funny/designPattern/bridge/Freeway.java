package com.lydia4me.funny.designPattern.bridge;

public class Freeway extends Road {

	public Freeway(Transport runnable) {
		super(runnable);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("在高速公路上行驶");
	}

}
