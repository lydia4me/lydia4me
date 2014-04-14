package com.lydia4me.funny.base.statics;

public class StaticInitTest {
	private static StaticInitTest instance = new StaticInitTest();
	private static int count = 1;
	private StaticInitTest(){
		System.out.println(count);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInitTest.getInstance();
	}

	private static StaticInitTest getInstance() {
		return instance;
	}

}
