package BinarySearchTree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
	public static ArrayList<Integer> inOrderTraversal(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (root == null)
			return result;
		
		Stack<Node> stack = new Stack<Node>();
		Node p = root;
		
		while (!stack.isEmpty() || p != null) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				Node t = stack.pop();
				result.add(t.value);
				p = t.right;
			}
		}
		
		return result;
	}
	
	public static ArrayList<Character> inOrderTraversalChar(Node root) {
		ArrayList<Character> result = new ArrayList<Character>();
		
		if (root == null)
			return result;
		
		Stack<Node> stack = new Stack<Node>();
		Node p = root;
		
		while (!stack.isEmpty() || p != null) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				Node t = stack.pop();
				result.add(t.c);
				p = t.right;
			}
		}
		
		return result;
	}
}