package com.lydia4me.funny.algorithm.search;

public class BinarySearch {
	public static void main(String[] args){
		int[] input = {2,5,8,10,13,16,18,19,28,29,33};
		System.out.println(search(input, 5, 0, input.length - 1));
	}

	private static int search(int[] input, int it, int start, int end) {
		while(start <= end){
			int m = start + (end - start) / 2;
			if(input[m] == it){
				return m;
			}else if(input[m] > it){
				end = m - 1;
			}else{
				start = m + 1;
			}
		}
		return -1;
	}
}
