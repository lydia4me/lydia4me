package com.lydia4me.funny.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {
	public static void main(String[] args){
		System.out.println(StringParser.parseInt("1235"));
	}
	
	//bug很多，需改进
	public static int parseInt(String str){
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		if(!matcher.matches()){
			throw new IllegalArgumentException();
		}
		int result = 0;
		char[] chs = str.toCharArray();
		int multi = 1;
		for(int i = chs.length - 1; i >= 0; i--){
			int bitInt = Character.digit(chs[i], 10);
			if(i < chs.length - 1){
				multi = multi * 10;
			}
			result += multi * bitInt;
		}
		return result;
	}
}
