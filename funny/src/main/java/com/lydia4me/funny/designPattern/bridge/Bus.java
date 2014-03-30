package com.lydia4me.funny.designPattern.bridge;

public class Bus extends Transport {

	public Bus(People driver) {
		super(driver);
	}

	@Override
	public void run() {
		super.run();
		System.out.print("公共汽车");
	}

}
