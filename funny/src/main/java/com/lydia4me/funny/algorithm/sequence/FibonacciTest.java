package com.lydia4me.funny.algorithm.sequence;
/**
 * 要求以线性时间复杂度实现斐波那契数列。
 * 1， 1， 2， 3， 5， 8， 13， 21， 34， 55， 89， 。。。。。。
 *
 */
public class FibonacciTest {
	public static void main(String[] args) {
		int size = 40;
		int[] seq = new int[size];
		int i = 0;
		while(i < size){
			if(i < 2){
				seq[i] = 1;
			}else{
				seq[i] = seq[i - 1] + seq[i - 2];
			}
			System.out.print(seq[i]+",  ");
			i ++;
		}
	}
}
