package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
	public static ArrayList<Integer> postOrderTraversal(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (root == null)
			return result;
		
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		
		Node previous = null;
		
		while (!stack.isEmpty()) {
			Node current = stack.peek();
			
			if (previous == null || previous.left == current || previous.right == current) {
				if (current.left != null)
					stack.push(current.left);
				else if (current.right != null)
					stack.push(current.right);
				else {
					stack.pop();
					result.add(current.value);
				}
			} else if (current.left == previous) {
				if (current.right != null)
					stack.push(current.right);
				else {
					stack.pop();
					result.add(current.value);
				}
			} else if (current.right == previous) {
				stack.pop();
				result.add(current.value);
			}
			
			previous = current;
		}
		
		return result;
	}
}