package com.lydia4me.funny.designPattern.singleton;

public class SingletonHolderSingleton {
	private SingletonHolderSingleton(){}
	private static class SingletonHolder{
		private static final SingletonHolderSingleton INSTANCE = new SingletonHolderSingleton();
	}
	public SingletonHolderSingleton getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
