package com.lydia4me.funny.algorithm.range;


public class AllRange {
	public static void main(String[] args){
		String str = "123";
		char[] chs = str.toCharArray();
		allRange(chs, 0, chs.length-1);
	}

	private static void allRange(char[] chs, int start, int end) {
		if(start == end){
			for(char c : chs){
				System.out.print(c);
			}
			System.out.println();
		}else{
			for(int i = start; i <= end; i ++){
				swap(chs, i, start);
				allRange(chs, start+1, end);
				swap(chs, i, start);
			}
		}
	}

	private static void swap(char[] chs, int i, int j) {
		if(i >= 0 && j >= 0 && i < chs.length && j < chs.length){
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
		}
	}
}
