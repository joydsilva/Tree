package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Stack;

public class TreeTraversalTest {
	
	public static void main(String[] args) {
		
		TreeNode rootNode = new TreeNode("80");
		TreeNode node1 = new TreeNode("59");
		TreeNode node2 = new TreeNode("95");
		TreeNode node3 = new TreeNode("19");
		TreeNode node4 = new TreeNode("78");
		
		rootNode.left = node1;
		rootNode.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		breadthFirst(rootNode);
		depthFirst(rootNode);
		
		
		TreeNode les  = new TreeNode("Les");
		TreeNode cathy = new TreeNode("Cathy");
		TreeNode sam  = new TreeNode("Sam");
		TreeNode alex  = new TreeNode("Alex");
		TreeNode frank  = new TreeNode("Frank");
		TreeNode nancy  = new TreeNode("Nancy");
		TreeNode violet  = new TreeNode("Violet");
		TreeNode tony  = new TreeNode("Tony");
		TreeNode wendy  = new TreeNode("Wendy");
		
		les.left =cathy;
		les.right = sam;
		
		cathy.left = alex;
		cathy.right = frank;
		
		sam.left = nancy;
		sam.right = violet;
		
		violet.left = tony;
		violet.right = wendy;
		
		
		//inOrderTraversal(les);
		//preOrderTraversal(les);
		//postOrderTraversal(les);
		/**
		 * Level order is breadth first
		 */
		breadthFirst(les);
		
	}
	
	/**
	 * Inorder Traversal
	 * Left, Root, Right
	 * using recursive
	 */
	
	public static void inOrderTraversal(TreeNode rootNode){
		if(rootNode!=null){
			inOrderTraversal(rootNode.left);
			rootNode.debug();
			inOrderTraversal(rootNode.right);
		}
	}
	
	/**
	 * Inorder Traversal
	 * Left, Root, Right
	 * using recursive
	 */
	
	public static void preOrderTraversal(TreeNode rootNode){
		if(rootNode!=null){
			
			rootNode.debug();
			preOrderTraversal(rootNode.left);
			preOrderTraversal(rootNode.right);
		}
	}
	
	
	/**
	 * Inorder Traversal
	 * Left, Root, Right
	 */
	
	public static void postOrderTraversal(TreeNode rootNode){
		if(rootNode!=null){
			
			
			postOrderTraversal(rootNode.left);
			postOrderTraversal(rootNode.right);
			rootNode.debug();
		}
	}
	
	
	/**
	 * Breadth First traversal
	 */
	
	public static void breadthFirst(TreeNode rootNode){
		
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>(); 
		queue.add(rootNode);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.pop();
			node.debug();
			if(node.left != null){
			queue.add(node.left);
			}
			if(node.left != null){
			queue.add(node.right);
			}
			
		}
		
		
	}
	
	/**
	 * Depth First Traversal
	 */
	public static void depthFirst(TreeNode rootNode){
		
		Stack<TreeNode> stack = new Stack<TreeNode>(); 
		stack.add(rootNode);
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			
			node.debug();
			if(node.right != null){
			stack.add(node.right);
			}
			if(node.left != null){
			stack.add(node.left);
			}
			
		}
		
		while(!stack.isEmpty()){
			
			
		}
		
	}

}
