package com.lydia4me.funny.designPattern;

public class Singleton {
	private static Singleton singleton;
	private Singleton(){
	}
	public static Singleton getInstance(){
		synchronized(singleton){
			if(singleton == null){
				synchronized(singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
