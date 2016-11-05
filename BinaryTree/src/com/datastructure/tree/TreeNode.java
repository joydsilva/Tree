package com.datastructure.tree;

public class TreeNode {
	String data;
	TreeNode left = null;
	TreeNode right = null;;
	
	TreeNode(String data){
		this.data = data;
	}
	
	public void debug(){
		System.out.println(data);
	}
	
	public void inOrderTraversal(){
		System.out.println(left.data +"--"+ data + "--"+right.data);
	}
	
	

}
