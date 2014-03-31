package com.lydia4me.funny.algorithm.sort;


public class MergeSort {
	public static void main(String[] args){
		int[] left = {2,4,6,7,12,15,17,18,21,29,35};
        int[] right= {1,2,3,6,10,25,27};
        int[] result = mergeSort(left, right);
        for(int i : result){
        	System.out.println(i);
        }
	}

	private static int[] mergeSort(int[] left, int[] right) {
		int size = left.length + right.length;
		int[] result = new int[size];
		int index = 0;
		int i = 0;
		int j = 0;
		while(i < left.length && j < right.length){
			while(i < left.length && j < right.length && left[i] >= right[j]){
				result[index] = right[j];
				j ++;
				index ++;
			}
			while(i < left.length && j < right.length && left[i] < right[j]){
				result[index] = left[i];
				i ++;
				index ++;
			}
		}
		if(i == left.length && j < right.length){
			System.arraycopy(right, j, result, index, right.length - j);
		}
		if(j == right.length && i < left.length){
			System.arraycopy(left, i, result, index, left.length - i);
		}
		return result;
	}
}
