package com.lydia4me.funny.algorithm.range;

/**
 * 输入矩阵
 * 		1	2	3
 * 		4	5	6
 * 		7	8	9
 * 要求按照如下顺序打印：3	2	6	1	5	9	4	8	7
 *
 */
public class PrintZ {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int w1 = input.length;
		int w2 = input[0].length;
		for (int j = w2 - 1; j >= 0; j--) {
			int si = 0;
			int sj = j;
			while (si < w1 && sj < w2) {
				System.out.print(input[si][sj] + " ");
				si++;
				sj++;
			}
		}
		for (int i = 1; i < w2; i++) {
			int si = i;
			int sj = 0;
			while (si < w1 && sj < w2) {
				System.out.print(input[si][sj] + " ");
				si++;
				sj++;
			}
		}
	}

}
