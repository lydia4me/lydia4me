package com.lydia4me.funny.designPattern.bridge;

public class BridgeTest {
	public static void main(String[] args){
		People man = new Man();
		Transport bicycle = new Bicycle(man);
		Road street = new Street(bicycle);
		street.run();
		
		People woman = new Woman();
		Transport bus = new Bus(woman);
		Road freeway = new Freeway(bus);
		freeway.run();
	}
}
