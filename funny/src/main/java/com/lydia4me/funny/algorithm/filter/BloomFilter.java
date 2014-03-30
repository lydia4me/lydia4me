package com.lydia4me.funny.algorithm.filter;

import java.util.BitSet;

public class BloomFilter {
	private static final int DEFAULT_SIZE = 1 << 25;
	private static final int[] seeds = {7, 13, 17, 19, 23, 29};
	private SimpleHash[] hashs;
	private BitSet bitSet;
	public BloomFilter(){
		bitSet = new BitSet(DEFAULT_SIZE);
		hashs = new SimpleHash[seeds.length];
		for(int i = 0; i < seeds.length; i ++){
			hashs[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
		}
	}
	
	public void add(String str){
		if(str == null){
			return;
		}
		for(SimpleHash hash : hashs){
			bitSet.set(hash.hash(str), true);
		}
	}
	
	public boolean contains(String str){
		if(str == null){
			return false;
		}
		for(SimpleHash hash : hashs){
			if(!bitSet.get(hash.hash(str))){
				return false;
			}
		}
		return true;
	}
	
	public static class SimpleHash{
		private int cap;
		private int seed;
		
		public SimpleHash(int cap, int seed) {
			super();
			this.cap = cap;
			this.seed = seed;
		}

		public int hash(String str){
			int result = 0;
			char[] chs = str.toCharArray();
			for(char ch : chs){
				result += result * seed + ch;
			}
			return cap -1 & result;
		}
	}
}
