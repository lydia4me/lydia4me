package com.lydia4me.funny.algorithm.arithmetic.impl;

import com.lydia4me.funny.algorithm.arithmetic.Operator;

public class Plus implements Operator {

	@Override
	public double getResult(double left, double right) {
		return left + right;
	}

	@Override
	public int getPriority() {
		return 3;
	}

}
