package com.lydia4me.funny.algorithm.sequence;

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
		int times = 0;
		for(int i = 0; i < str.length(); i ++){
			for(int j = 2; j < str.length() / 2 && i + j <= str.length(); j ++){
				times++;
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
		System.out.println("size="+str.length() + "; times = "+ times);
		for(String key : strCountMap.keySet()){
			System.out.println(key + ":" + strCountMap.get(key));
		}
		return maxCountStr;
	}
}
