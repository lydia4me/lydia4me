package com.lydia4me.funny.algorithm.minimumStep;

import java.util.ArrayList;
import java.util.List;

/**
 *	
Given an array of integers, each element represents the max number of jumps that you can move forward.
Write a piece of code to find out the minimum number of elements you need to select to reach the end of the array (starting from the first element).
o All integers is equal to or greater than 0
o If an element is 0, you cannot make any jumps
o -1 should be output if it is unable to reach the end of the array
Here is an example to illustrate the question.
Sample Input: 1,3,5,2,9,3,1,1,8
Sample Output: 3
Explanation:
Here the min # of selections is : 3
with the sequence : 1-> 3 -> 9 ->8
First element is 1, so can only go to 3.
Second element is 3, so can make at most 3 jumps: eg to 5 or 2 or 9. 
 */
public class MinimumStep {
	private static List<String> roads = new ArrayList<String>();
	private final static String CONNECTOR = "-> ";

	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 2, 9, 3, 1, 1, 8 };
		getMinimumStep(input, 0, "");
		if (roads.size() == 0) {
			System.out.println("-1: There is no way to the last elements.");
			return;
		}
		String minStep = roads.get(0);
		for (String road : roads) {
			if (road.split(CONNECTOR).length < minStep.split(CONNECTOR).length) {
				minStep = road;
			}
		}
		System.out.println("The minimum step to the last element is:" + (minStep.split(CONNECTOR).length - 1));
		System.out.println("The minimum road to the last element is:" + minStep);
	}

	private static void getMinimumStep(int[] input, int current, String road) {
		int stepNum = input[current];
		if (stepNum == 0) {
			return;
		}
		if (!"".equals(road)) {
			road += CONNECTOR;
		}
		road += stepNum;
		if (current + stepNum >= input.length - 1) {
			roads.add(road + CONNECTOR + input[input.length - 1]);
			return;
		}
		for (int i = current + 1; i <= current + stepNum; i++) {
			getMinimumStep(input, i, road);
		}
	}
}
