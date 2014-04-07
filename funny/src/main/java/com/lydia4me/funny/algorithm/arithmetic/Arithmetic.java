package com.lydia4me.funny.algorithm.arithmetic;

import java.util.Stack;

public class Arithmetic {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		//A*B+C
		String input = "5+6*3";
		Stack stack = new Stack();
		Stack<Operator> opStack = new Stack<Operator>();
		for(char ch : input.toCharArray()){
			if(ch >= '0' && ch <= '9'){
				stack.push(ch);
			}else{
				opStack.push(OperatorFactory.getOperator(ch));
			}
		}
		while(!opStack.isEmpty()){
			Operator op = opStack.pop();
		}
	}
}
