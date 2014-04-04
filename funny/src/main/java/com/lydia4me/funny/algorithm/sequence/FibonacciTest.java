package com.lydia4me.funny.algorithm.sequence;

import java.math.BigDecimal;

/**
 * 要求以线性时间复杂度实现斐波那契数列。
 * 1， 1， 2， 3， 5， 8， 13， 21， 34， 55， 89， 。。。。。。
 *
 */
public class FibonacciTest {
	public static void main(String[] args) {
		int size = 100;
		BigDecimal[] seq = new BigDecimal[2];
		int i = 0;
		while(i < size){
			if(i < 2){
				seq[i] = new BigDecimal(1);
			}else{
				seq[i%2] = seq[0].add(seq[1]);
			}
			System.out.print(seq[i%2]+",  ");
			i ++;
		}
	}
}
