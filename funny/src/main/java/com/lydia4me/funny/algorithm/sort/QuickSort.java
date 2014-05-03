package com.lydia4me.funny.algorithm.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 7, 3, 8, 4, 56, 78, 3, 2, 89, 4 };
		quickSort(arr, 0, arr.length - 1);
        for (int i : arr){
            System.out.print(i+",");
        }
	}

    private static void quickSort(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while(i < j){
            while(i < j && arr[i] <= arr[j]){
                i ++;
            }
            if(i < j && arr[i] > arr[j]){
                swap(arr, i, j);
            }
            while(i < j && arr[i] <= arr[j]){
                j --;
            }
            if(i < j && arr[i] > arr[j]){
                swap(arr, i, j);
            }
        }
        if(i - start > 0){
            quickSort(arr, start, i - 1);
        }
        if(end - j > 0){
            quickSort(arr, j + 1, end);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
