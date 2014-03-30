package com.lydia4me.funny.designPattern.bridge;

public abstract class Transport {
	private People driver;
	
	public Transport(People driver) {
		super();
		this.driver = driver;
	}
	
	public void run(){
		driver.printName();
		System.out.print("开着");
	}
}
