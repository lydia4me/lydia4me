package com.lydia4me.funny.algorithm.sequence;
/**
 * 要求以线性时间复杂度实现斐波那契数列。
 * 1， 1， 2， 3， 5， 8， 13， 21， 34， 55， 89， 。。。。。。
 *
 */
public class FibonacciTest {
	public static void main(String[] args) {
		int size = 40;
		int[] seq = new int[2];
		int i = 0;
		while(i < size){
			if(i < 2){
				seq[i] = 1;
			}else{
				seq[i%2] = seq[0] + seq[1];
			}
			System.out.print(seq[i%2]+",  ");
			i ++;
		}
	}
}
