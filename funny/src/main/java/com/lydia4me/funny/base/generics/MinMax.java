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
}
