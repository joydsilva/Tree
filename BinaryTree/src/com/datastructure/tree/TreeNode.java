package com.datastructure.tree;
/**
 * Binary Tree class
 * 
 * @author joydsilva
 *
 */
public class TreeNode {
	String data;
	TreeNode left = null;
	TreeNode right = null;;

	TreeNode(String data) {
		this.data = data;
	}

	public void debug() {
		System.out.println(data);
	}

}
