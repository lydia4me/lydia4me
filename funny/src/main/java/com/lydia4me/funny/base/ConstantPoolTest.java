package com.lydia4me.funny.base;

public class ConstantPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = 128;
		Integer j = 128;
		System.out.println(i==j);
		
		String a = "abc";
		String b = "abc";
		System.out.println(a==b);
		
		String c = new String("def").intern();
		String d = "def";
		System.out.println(c==d);
		
		String e = new String("def").intern();
		String f = new String("def");
		System.out.println(c==e);
		System.out.println(c==f);
	}

}
