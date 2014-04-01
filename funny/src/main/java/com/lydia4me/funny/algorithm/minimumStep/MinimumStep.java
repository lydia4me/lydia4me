package com.lydia4me.funny.algorithm.minimumStep;


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
	private final static String CONNECTOR = "-> ";
	private String minRoad = "";
	private Integer counter = Integer.MAX_VALUE;
	private int[] input;

	public MinimumStep(int[] input) {
		super();
		this.input = input;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 2, 9, 3, 1, 1, 8 };
		MinimumStep step = new MinimumStep(input);
		step.printMinimumStep();
	}
	
	public void printMinimumStep(){
		getMinimumStep(input, 0, "");
		if (counter == Integer.MAX_VALUE) {
			System.out.println("-1: There is no way to the last element.");
			return;
		}
		System.out.println("The minimum step to the last element is:" + counter);
		System.out.println("The minimum road to the last element is:" + minRoad);
	}

	private void getMinimumStep(int[] input, int current, String road) {
		int stepNum = input[current];
		if (stepNum == 0) {
			return;
		}
		if (!"".equals(road)) {
			road += CONNECTOR;
		}
		road += stepNum;
		if (current + stepNum >= input.length - 1) {
			String thisRoad = road + CONNECTOR + input[input.length-1];
			int thisCounter = thisRoad.split(CONNECTOR).length - 1;
			if(counter == Integer.MAX_VALUE || thisCounter < counter){
				minRoad = thisRoad;
				counter = thisCounter;
			}
			return;
		}
		for (int i = current + 1; i <= current + stepNum; i++) {
			getMinimumStep(input, i, road);
		}
	}
}
