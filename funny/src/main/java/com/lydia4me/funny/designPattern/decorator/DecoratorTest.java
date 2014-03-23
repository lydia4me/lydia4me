package com.lydia4me.funny.designPattern.decorator;

public class DecoratorTest {
	public static void main(String[] args){
		Service service = new ServiceImpl();
		Service serviceDecorator = new ServiceDecorator(service);
		serviceDecorator.service();
	}
}
