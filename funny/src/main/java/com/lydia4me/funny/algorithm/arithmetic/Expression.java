package com.lydia4me.funny.algorithm.arithmetic;

public class Expression {
	private Expression left;
	private Expression right;
	private double leftNum;
	private double rightNum;
	private Operator operator;
	public Expression getLeft(){
		return left;
	}
	public Expression getRight(){
		return right;
	}
	public Operator getOperator(){
		return operator;
	}
	public double getResult(){
		return operator.getResult(left.getLeftResult(), right.getRightResult());
	}
	private double getLeftResult(){
		if(left == null){
			return leftNum;
		}
		return left.getResult();
	}
	private double getRightResult(){
		if(right == null){
			return rightNum;
		}
		return right.getResult();
	}
}
