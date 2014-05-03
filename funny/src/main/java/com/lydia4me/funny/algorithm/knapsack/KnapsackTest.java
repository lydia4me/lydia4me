package com.lydia4me.funny.algorithm.knapsack;

import java.util.HashMap;
import java.util.Map;

/**
 * 背包问题
 */
public class KnapsackTest {
	private static int times = 0;
    private static Map<String, Integer> maxVolumes = new HashMap<String, Integer>();
	public static void main(String[] args){
        long start = System.currentTimeMillis();
		int[] volumes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15,16,17,18};
		int[] values = {10, 20, 30, 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
		int maxVolume = 48;
		System.out.println(knapsack(maxVolume, volumes, values, volumes.length));
        long end = System.currentTimeMillis();
		System.out.println("times="+times);
        System.out.println("Time last : " + (end - start));
	}
	
	private static int knapsack(int maxVolume, int[] volumes, int[] values, int n){
		times ++;
		if(n == 0 || maxVolume == 0){
			return 0;
		}
		if(volumes[n - 1] > maxVolume){
			return knapstackFromCache(maxVolume, volumes, values, n-1);
		}
		return max(values[n - 1] + knapstackFromCache(maxVolume - volumes[n - 1], volumes, values, n - 1),
                knapstackFromCache(maxVolume, volumes, values, n - 1)
				);
	}
	private static int max(int a, int b){
		return a > b ? a : b;
	}
    private static int knapstackFromCache(int maxVolume, int[] volumes, int[] values, int n){
        String key = maxVolume + "," + n;
        if(!maxVolumes.containsKey(key)){
            maxVolumes.put(key, knapsack(maxVolume, volumes, values, n));
        }
        return maxVolumes.get(key);
    }
}
