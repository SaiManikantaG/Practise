package BinarySearchTree;

import java.util.Stack;

public class FlattenBST {
	public static void flattenBST(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node p = root;
		
		while (p != null || !stack.isEmpty()) {
			if (p.right != null)
				stack.push(p.right);
			
			if (p.left != null) {
				p.right = p.left;
				p.left = null;
			} else if (!stack.isEmpty()) {
				Node temp = stack.pop();
				p.right = temp;
			}
			
			p = p.right;
		}
	}
}