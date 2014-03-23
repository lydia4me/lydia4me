package com.lydia4me.funny.designPattern.factory.simpleFactory;

public class ServiceFactory {
	public static Service getService(String flag){
		if("A".equals(flag)){
			return new ServiceA();
		}else if("B".equals(flag)){
			return new ServiceB();
		}else{
			throw new IllegalArgumentException();
		}
	}
}
