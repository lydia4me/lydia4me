package com.lydia4me.funny.algorithm.range;

/**
 * 输入矩阵
 * 		1	2	3	4
 * 		5	6	7	8
 * 		9	10	11	12
 * 		13	14	15	16
 * 
 * 		1	2	3
 * 		4	5	6
 * 		7	8	9
 * 要求按照蛇形顺序从右上角开始打印：4 8 3 2 7 12 16 11 6 1 5 10 15 14 9 13
 */
public class PrintSnake {
	public static void main(String[] args){
		int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int w1 = input.length;
		int w2 = input[0].length;
		int size = w1 * w2;
		int count = 0;
		int si = 0;
		int sj = w2 - 1;
		boolean down = true;
		while(count < size){
			System.out.print(input[si][sj] + " ");
			if(down){
				si++;
				sj++;
			}else{
				si--;
				sj--;
			}
			if(sj > w2 - 1){
				down = !down;
				sj --;
				if(si > w1 - 1){
					si--;
					sj--;
				}
			}else if(si < 0){
				down = !down;
				si ++;
				if(sj < 0){
					si++;
					sj++;
				}
			}else if(si > w1 - 1){
				down = !down;
				si --;
				sj = sj - 2;
			}else if(sj < 0){
				down = !down;
				sj++;
				si = si + 2;
			}
			count ++;
		}
	}
}
