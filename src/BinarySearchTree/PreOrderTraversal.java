package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
	public static ArrayList<Integer> preOrderTraversal(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (root == null)
			return result;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			Node n = stack.pop();
			result.add(n.value);
			
			if (n.right != null)
				stack.push(n.right);
			
			if (n.left != null)
				stack.push(n.left);
		}
		
		return result;
	}
}