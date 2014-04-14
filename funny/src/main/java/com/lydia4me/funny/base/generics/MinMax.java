package com.lydia4me.funny.base.generics;

public class MinMax<E extends Comparable<E>> {
	E left;
	E right;
	public MinMax(E left, E right){
		this.left = left;
		this.right = right;
	}
	public E getMin(){
		if(left.compareTo(right) > 0){
			return right;
		}
		return left;
	}
	
	public E getMax(){
		if(left.compareTo(right) > 0){
			return left;
		}
		return right;
	}
	public static void main(String[] args){
		Integer left = 16;
		Integer right = 39;
		MinMax<Integer> minMax = new MinMax<Integer>(left, right);
		System.out.println(minMax.getMax());
		System.out.println(minMax.getMin());
	}
}
