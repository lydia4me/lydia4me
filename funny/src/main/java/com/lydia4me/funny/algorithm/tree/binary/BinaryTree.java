package com.lydia4me.funny.algorithm.tree.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * 有这样的一个2叉树 ，结构如
    class BinaryNode{
          int data;
          BinaryNode mLeft;
          BinaryNode mRight;

     }
      给定一个整数和一棵2叉树，从根节点开始遍历，直到叶节点止，要求打印出所经过的所有节点的data
      值累加等于该整数，如给出22，输出 10 12；10 5 7 ；
 *
 */
public class BinaryTree {
	private final static String CONNECTOR = ",";
	private final static int sum = 24;
	private static List<String> roads = new ArrayList<String>();
	
	private int data;
	private BinaryTree leftNode;
	private BinaryTree rightNode;

	public static void main(String[] args) {
		BinaryTree tree = BinaryTree.getInstance();
		getRoad(tree, 0, "");
		for(String road : roads){
			System.out.println(road);
		}
	}
	
	public static void getRoad(BinaryTree tree, int plus, String road){
		if(plus + tree.data == sum){
			road += CONNECTOR + tree.data;
			roads.add(road);
			return;
		}
		if(plus + tree.data > sum){
			return;
		}
		if(!"".equals(road)){
			road += CONNECTOR;
		}
		road += tree.data;
		plus += tree.data;
		if(tree.leftNode != null){
			getRoad(tree.leftNode, plus, road);
		}
		if(tree.rightNode != null){
			getRoad(tree.rightNode, plus, road);
		}
	}
	
	/**
	 * 		     5
	 * 	    3          7
	 *    6   9      12  17
	 *  10      7
	 * @return
	 */
	public static BinaryTree getInstance(){
		BinaryTree tree = new BinaryTree();
		tree.data = 5;
		BinaryTree left1 = new BinaryTree();
		left1.data = 3;
		BinaryTree right1 = new BinaryTree();
		right1.data = 7;
		tree.leftNode = left1;
		tree.rightNode = right1;
		
		BinaryTree left1Left1 = new BinaryTree();
		left1Left1.data = 6;
		left1.leftNode = left1Left1;
		
		BinaryTree left1Right1 = new BinaryTree();
		left1Right1.data = 9;
		left1.rightNode = left1Right1;
		
		BinaryTree right1Left1 = new BinaryTree();
		right1Left1.data = 12;
		right1.leftNode = right1Left1;
		
		BinaryTree right1Right1 = new BinaryTree();
		right1Right1.data = 17;
		right1.rightNode = right1Right1;
		
		BinaryTree left1Left1Left1 = new BinaryTree();
		left1Left1Left1.data = 10;
		left1Left1.leftNode = left1Left1Left1;
		
		BinaryTree left1Right1Right = new BinaryTree();
		left1Right1Right.data = 7;
		left1Right1.rightNode = left1Right1Right;
		return tree;
	}
}
