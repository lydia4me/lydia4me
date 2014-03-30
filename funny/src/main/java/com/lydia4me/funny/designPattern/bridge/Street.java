package com.lydia4me.funny.designPattern.bridge;

public class Street extends Road {

	public Street(Transport runnable) {
		super(runnable);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("在街道上行驶");
	}

}
