package BinarySearchTree;

import java.util.Arrays;

public class WordBST {
	private static void createBinarySearchTree(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		Node root = createMinimalBinarySearchTree(content, 0, s.length() - 1);
		System.out.println(InOrderTraversal.inOrderTraversalChar(root).toString());
	}
	
	private static Node createMinimalBinarySearchTree(char[] content, int start, int end) {
		if (end < start)
			return null;
		
		int mid = (start + end) / 2;
		
		Node BSTNode = new Node(content[mid]);
		BSTNode.left = createMinimalBinarySearchTree(content, start, mid - 1);
		BSTNode.right = createMinimalBinarySearchTree(content, mid + 1, end);
		
		return BSTNode;
	}
	
	public static void main(String[] args) {
		createBinarySearchTree("CERNER");
	}
}