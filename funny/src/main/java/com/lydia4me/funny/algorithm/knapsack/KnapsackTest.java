package com.lydia4me.funny.algorithm.knapsack;
/**
 * 背包问题
 */
public class KnapsackTest {
	private static int times = 0;
	public static void main(String[] args){
		int[] volume = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15,16,17,18};
		int[] value = {10, 20, 30, 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
		int maxVolume = 48;
		System.out.println(knapsack(maxVolume, volume, value, volume.length));
		System.out.println("times="+times);
	}
	
	//TODO:improve
	private static int knapsack(int maxVolume, int[] volume, int[] value, int n){
		times ++;
		if(n == 0 || maxVolume == 0){
			return 0;
		}
		if(volume[n - 1] > maxVolume){
			return knapsack(maxVolume, volume, value, n-1);
		}
		return max(value[n - 1] + knapsack(maxVolume - volume[n - 1], volume, value, n - 1),
				knapsack(maxVolume, volume, value, n - 1)
				);
	}
	private static int max(int a, int b){
		return a > b ? a : b;
	}
}
