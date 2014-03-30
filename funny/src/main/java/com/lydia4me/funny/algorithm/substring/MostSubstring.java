package com.lydia4me.funny.algorithm.substring;

import java.util.HashMap;
import java.util.Map;

public class MostSubstring {

	public static void main(String[] args) {
		String str = "abcbcabcabcdefscabdefgdsbab";
		System.out.println(getMostSubstring(str));
	}

	public static String getMostSubstring(String str){
		Map<String, Integer> strCountMap = new HashMap<String, Integer>();
		int maxCount = 0;
		String maxCountStr = "";
		for(int i = 0; i < str.length(); i ++){
			for(int j = 2; i + j <= str.length(); j ++){
				String subStr = str.substring(i, i + j);
				int count = 1;
				if(strCountMap.containsKey(subStr)){
					count = count + strCountMap.get(subStr);
				}
				strCountMap.put(subStr, count);
				if(count > maxCount){
					maxCount = count;
					maxCountStr = subStr;
				}
			}
		}
		
		return maxCountStr;
	}
}
