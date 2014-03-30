package com.lydia4me.funny.designPattern.bridge;

public class Bicycle extends Transport {

	public Bicycle(People driver) {
		super(driver);
	}

	@Override
	public void run() {
		super.run();
		System.out.print("自行车");
	}

}
