package com.lydia4me.funny.base.cast;

import java.util.HashMap;
import java.util.Map;

public class BaseCastTest {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		System.out.println((int)map.get(1)==1);
	}

}
