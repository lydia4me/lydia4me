package com.lydia4me.funny.designPattern.singleton;

public enum EnumSingleton {
	INSTANCE;
	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
}
