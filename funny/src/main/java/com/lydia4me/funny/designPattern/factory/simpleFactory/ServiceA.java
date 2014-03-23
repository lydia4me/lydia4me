package com.lydia4me.funny.designPattern.factory.simpleFactory;

public class ServiceA implements Service {

	@Override
	public void invoke() {
		System.out.println("service invoked in service A");
	}

}
