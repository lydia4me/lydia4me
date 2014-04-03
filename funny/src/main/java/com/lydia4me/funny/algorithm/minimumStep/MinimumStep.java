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
	private int times = 0;
	
	public MinimumStep(int[] input) {
		super();
		this.input = input;
	}

	public static void main(String[] args) {
		//-------------!-!-----!---------------!-------------!---------------!-------------!-
		int[] input = {1,3,5,2,9,3,1,1,8,4,3,5,8,2,1,2,3,4,6,8,4,7,2,8,3,2,5,7,9,3,2,5,7,9,2};
//		int[] input = {1,2,1,2,1,3,1,1,8};
		//-------------!-!-----!---------------!-------------!-------!---------!-----------!-
		MinimumStep step = new MinimumStep(input);
		step.printMinimumStep();
	}
	
	public void printMinimumStep(){
		System.out.println("Number count : " + input.length);
		System.out.println("Improved road:"+improvedMinimumStep(input));
		System.out.println("Improved time:"+times);
		System.out.println();
		times = 0;
		getMinimumStep(input, 0, "");
		if (counter == Integer.MAX_VALUE) {
			System.out.println("-1: There is no way to the last element.");
			return;
		}
		System.out.println("The minimum step to the last element is:" + counter);
		System.out.println("The minimum road to the last element is:" + minRoad);
		System.out.println("Time is : "+ times);
	}

	private void getMinimumStep(int[] input, int current, String road) {
		times ++;
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
	
	private String improvedMinimumStep(int[] input){
		StringBuilder road = new StringBuilder();
		int index = 0;
		while(true){
			times ++;
			int num = input[index];
			if(!"".equals(road.toString())){
				road.append(CONNECTOR);
			}
			road.append(num);
			if(index + num >= input.length - 1){
				road.append(CONNECTOR).append(input[input.length - 1]);
				return road.toString();
			}
			if(num == 0){
				return "-1";
			}
			int nextIndex = index + 1;
			int max = input[nextIndex]+nextIndex;
			for(int i = nextIndex + 1; i <= index + num; i ++){
				times ++;
				if(input[i]+i >= max){
					nextIndex = i;
					max = input[i]+i;
				}
			}
			index = nextIndex;
		}
	}
}
