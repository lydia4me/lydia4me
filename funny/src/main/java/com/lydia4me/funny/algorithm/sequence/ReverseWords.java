package com.lydia4me.funny.algorithm.sequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		String input = " This  is  a  practice ";
		reverseNormally(input);
		
		char[] chs = input.toCharArray();
		reverse(chs);
		for(char ch : chs){
			System.out.print(ch);
		}
	}

	public static void reverseNormally(String input){
		if(input == null || input.length() == 1){
			return;
		}
		String[] sub = input.split("\\s+");
		List<String> list = Arrays.asList(sub);
		Collections.reverse(list);
		for(String s : list){
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	/**
	 * 输入字符数组，要求常数存储空间
	 * @param chs
	 */
	public static void reverse(char[] chs){
		if(chs == null || chs.length == 1){
			return;
		}
		reverse(chs, 0, chs.length);
		int start = 0;
		int end = 0;
		while(start < chs.length){
			for(int i = start; i < chs.length; i ++){
				if(chs[i] != ' '){
					if(i == chs.length - 1){
						end = chs.length;
					}
					continue;
				}
				if(i == start || chs[i - 1] == ' '){
					start ++;
				}else{
					end = i;
					break;
				}
			}
			reverse(chs, start, end);
			start = end + 1;
		}
	}
	
	private static void reverse(char[] chs, int start, int end){
		char temp;
		for(int i = 0; i < (end - start)/2; i ++){
			temp = chs[start + i];
			chs[start + i] = chs[end -1 - i];
			chs[end -1 - i] = temp;
		}
	}
}
