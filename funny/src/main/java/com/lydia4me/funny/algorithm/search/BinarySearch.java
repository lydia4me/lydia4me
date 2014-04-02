package com.lydia4me.funny.algorithm.search;

public class BinarySearch {
	public static void main(String[] args){
		int[] input = {1,5,8,10,13,16,18,19,28,29,33,38};
		System.out.println(search(input, 40, 0, input.length - 1));
	}

	private static int search(int[] input, int it, int start, int end) {
		if(input.length == 0 || start > end || it > input[end] || it < input[start]){
			return -1;
		}
		if(input[start] == it){
			return start;
		}
		if(input[end] == it){
			return end;
		}
		int mid = (start + end) >>> 1;
		if(mid == start && input[mid] != it){
			return -1;
		}
		if(input[mid] == it){
			return mid;
		}else if(input[mid] < it){
			return search(input, it, mid + 1, end);
		}else{
			return search(input, it, start, mid - 1);
		}
	}
}
