package com.lydia4me.funny.algorithm.range;
/**
 * 求一个数组分割成差值最小的两个子集
 *
 */
public class MinDifference {
	public static void main(String[] args){
		int[] input = {1,5,8,12,16,17,19,26,29};
		printMinDifference(input);
	}
	
	public static void printMinDifference(int[] input){
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		int range = 1 << input.length;
		for(int i = 0; i < range; i++){
			int sum = 0;
			for(int j = 0; j < input.length; j ++){
				int temp = 1 << j;
				sum += (temp & i) == 0 ? input[j] : -input[j];
			}
			if(Math.abs(sum) < min){
				min = Math.abs(sum);
				minIndex = i;
			}
		}
		System.out.println(min);
		int sum1 = 0;
		int sum2 = 0;
		for(int j = 0; j < input.length; j ++){
			int temp = 1 << j;
			if((minIndex & temp) == 0){
				System.out.print(input[j]+",");
				sum1 += input[j];
			}
		}
		System.out.println();
		for(int j = 0; j < input.length; j ++){
			int temp = 1 << j;
			if((minIndex & temp) != 0){
				System.out.print(input[j]+",");
				sum2 += input[j];
			}
		}
		System.out.println();
		System.out.println(sum1+"   "+sum2);
	}
}
