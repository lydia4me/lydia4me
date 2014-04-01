package com.lydia4me.funny.algorithm.range;

/**
 * 对于一个已经排好序的数组a，给定一个数X，判断该数组中是否存在2个数的和等于X
     要求时间复杂度为0（n）;
 *
 */
public class SumInArray {
	private final static int sum = 18;
	public static void main(String[] args){
		int[] input = {1,5,8,12,16,17,19,26,29};
		printTwoNum(input);
	}
	public static void printTwoNum(int[] input){
		int i = 0;
		int j = input.length - 1;
		while(i < j){
			int temp = input[i] + input[j];
			if(temp > sum){
				j --;
			}else if(temp < sum){
				i ++;
			}else{
				System.out.println("The two num is : "+input[i] + ", " + input[j]);
				return;
			}
		}
		System.out.println("Not found!");
	}
}
