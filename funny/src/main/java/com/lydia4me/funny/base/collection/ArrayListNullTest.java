package com.lydia4me.funny.base.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNullTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(null);
		int sum = 0;
		for(Integer i : arr){
			sum += i;//Exception
		}
		System.out.println(sum);
	}

}
