package com.lydia4me.funny.designPattern.factory.factoryMethod;

public class PlainFactory implements Factory {

	@Override
	public Plain createTransport() {
		return new Plain();
	}

}
