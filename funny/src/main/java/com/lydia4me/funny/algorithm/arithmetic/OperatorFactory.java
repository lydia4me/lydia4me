package com.lydia4me.funny.algorithm.arithmetic;

import com.lydia4me.funny.algorithm.arithmetic.impl.Division;
import com.lydia4me.funny.algorithm.arithmetic.impl.Minus;
import com.lydia4me.funny.algorithm.arithmetic.impl.Multiply;
import com.lydia4me.funny.algorithm.arithmetic.impl.Plus;

public class OperatorFactory {
	public static Operator getOperator(char ch){
		switch(ch){
			case '+' : return new Plus();
			case '-' : return new Minus();
			case '*' : return new Multiply();
			case '/' : return new Division();
		}
		throw new IllegalArgumentException("unknown operator:" + ch);
	}
}
