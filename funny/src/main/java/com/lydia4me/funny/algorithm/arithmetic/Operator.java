package com.lydia4me.funny.algorithm.arithmetic;

public interface Operator {
	double getResult(double left, double right);
	int getPriority();
}
