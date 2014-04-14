package com.lydia4me.funny.algorithm.probability;
/**
 * 有50个人在一个房间，那么有两个人是同一天生日的可能性有多大？（忽略闰年，即一年有365天）
 *
 */
public class SameBirthday {

	public static void main(String[] args) {
		double days = 365;
		int size = 50;
		double differentProbablity = 1;
		for(int i = 0; i < size; i ++){
			differentProbablity *= (days-i)/days;
		}
		System.out.println("Same probability is : " + (1-differentProbablity));
	}

}
