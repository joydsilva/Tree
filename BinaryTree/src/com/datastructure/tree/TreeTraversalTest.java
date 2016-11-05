package com.datastructure.tree;
/**
 * Test class 
 * @author joydsilva
 *
 */
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

		TreeUtils.breadthFirst(rootNode);
		TreeUtils.depthFirst(rootNode);

		TreeNode les = new TreeNode("Les");
		TreeNode cathy = new TreeNode("Cathy");
		TreeNode sam = new TreeNode("Sam");
		TreeNode alex = new TreeNode("Alex");
		TreeNode frank = new TreeNode("Frank");
		TreeNode nancy = new TreeNode("Nancy");
		TreeNode violet = new TreeNode("Violet");
		TreeNode tony = new TreeNode("Tony");
		TreeNode wendy = new TreeNode("Wendy");

		les.left = cathy;
		les.right = sam;

		cathy.left = alex;
		cathy.right = frank;

		sam.left = nancy;
		sam.right = violet;

		violet.left = tony;
		violet.right = wendy;

		// inOrderTraversal(les);
		// preOrderTraversal(les);
		// postOrderTraversal(les);
		/**
		 * Level order is breadth first
		 */
		// breadthFirst(les);
		TreeNode node = TreeUtils.search(les, "Tony");
		System.out.println(node.data);
		TreeUtils.addNode(les, new TreeNode("Joy"));

		TreeUtils.breadthFirst(les);

	}

}
