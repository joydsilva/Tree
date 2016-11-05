package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Class TreeUtils
 * 
 * This class provides utility methods to traverse a binary tree in : Pre-Order
 * --> left, right, root | Post-Order -->root, left, right | In Order -->left, root,
 * right | Level Order --> breadth first
 * 
 * @author joydsilva
 *
 */
public class TreeUtils {
	/**
	 * Adds a node to the tree
	 * 
	 * @param root
	 * @param node
	 */
	public static void addNode(TreeNode root, TreeNode node) {

		TreeNode currentNode = root;

		while (true) {

			if (currentNode.left == null) {
				currentNode.left = node;
				return;
			}
			currentNode = currentNode.left;

		}

	}

	/**
	 * search a tree in depth first way and returns the matching node
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	public static TreeNode search(TreeNode node, String data) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(node);

		while (!stack.isEmpty()) {
			TreeNode currentNode = stack.pop();
			if (data.equals(currentNode.data)) {
				return currentNode;
			} else {
				if (currentNode.right != null) {
					stack.add(currentNode.right);
				}
				if (currentNode.left != null) {
					stack.add(currentNode.left);
				}
			}
		}

		return null;
	}

	/**
	 * Inorder Traversal Left, Root, Right using recursive
	 */

	public static void inOrderTraversal(TreeNode rootNode) {
		if (rootNode != null) {
			inOrderTraversal(rootNode.left);
			rootNode.debug();
			inOrderTraversal(rootNode.right);
		}
	}

	/**
	 * Inorder Traversal Left, Root, Right using recursive
	 */

	public static void preOrderTraversal(TreeNode rootNode) {
		if (rootNode != null) {

			rootNode.debug();
			preOrderTraversal(rootNode.left);
			preOrderTraversal(rootNode.right);
		}
	}

	/**
	 * Inorder Traversal Left, Root, Right
	 */

	public static void postOrderTraversal(TreeNode rootNode) {
		if (rootNode != null) {

			postOrderTraversal(rootNode.left);
			postOrderTraversal(rootNode.right);
			rootNode.debug();
		}
	}

	/**
	 * Breadth First traversal using QUEUE
	 */

	public static void breadthFirst(TreeNode rootNode) {

		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(rootNode);

		while (!queue.isEmpty()) {
			TreeNode node = queue.pop();
			node.debug();
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}

		}

	}

	/**
	 * Depth First Traversal using STACK
	 */
	public static void depthFirst(TreeNode rootNode) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(rootNode);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			node.debug();
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}

		}

	}

}
