package com.lydia4me.funny.designPattern.singleton;

public class DoubleCheckLockSingleton {
	private static volatile DoubleCheckLockSingleton singleton;
	private DoubleCheckLockSingleton(){
	}
	public static DoubleCheckLockSingleton getInstance(){
		if(singleton == null){
			synchronized(DoubleCheckLockSingleton.class){
				if(singleton == null){
					singleton = new DoubleCheckLockSingleton();
				}
			}
		}
		return singleton;
	}
}
