package com.lydia4me.funny.algorithm.range;

/**
 * 输入矩阵
 * 		1	2	3	4
 * 		5	6	7	8
 * 		9	10	11	12
 * 		13	14	15	16
 * 要求按照蛇形顺序从右上角开始打印：4 8 3 2 7 12 16 11 6 1 5 10 15 14 9 13
 */
public class PrintSnake {
	public static void main(String[] args){
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		int w1 = input.length;
		int w2 = input[0].length;
		int size = w1 * w2;
		int count = 0;
		int si = 0;
		int sj = w2 - 1;
		while(count < size){
			System.out.print(input[si][sj] + " ");
			
		}
	}
}
