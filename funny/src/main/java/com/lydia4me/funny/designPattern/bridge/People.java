package com.lydia4me.funny.designPattern.bridge;

public abstract class People {
	protected String name;

	public People() {
		super();
		this.name = "人";
	}
	
	public void printName(){
		System.out.print(name);
	}
}
