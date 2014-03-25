package com.lydia4me.funny.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {
	public static void main(String[] args){
		System.out.println(StringParser.parseInt("12345"));
		System.out.println(Integer.parseInt("3213213214214324123421312"));
	}
	
	public static int parseInt(String str){
		Pattern pattern = Pattern.compile("\\-?\\d+");
		Matcher matcher = pattern.matcher(str);
		if(!matcher.matches()){
			throw new NumberFormatException();
		}
		int result = 0;
		char[] chs = str.toCharArray();
		int end = 0;
		boolean negative = false;
		if(chs[0] == '-'){
			negative = true;
			end = 1;
		}
		int multi = 1;
		int limit = Integer.MAX_VALUE/10;
		if(negative){
			limit = Integer.MIN_VALUE/10;
		}
		for(int i = chs.length - 1; i >= end; i--){
			int bitInt = Character.digit(chs[i], 10);
			if(i < chs.length - 1){
				multi = multi * 10;
			}
			if(negative && -result < limit){
				throw new NumberFormatException();
			}
			if(!negative && result > limit){
				throw new NumberFormatException();
			}
			result += multi * bitInt;
		}
		if(negative){
			return -result;
		}
		return result;
	}
}
