package BinarySearchTree;

import java.util.LinkedList;

public class MinimumDepth {
	public static int minimumDepth(Node root) {
		if (root == null)
			return 0;
		
		LinkedList<Node> nodes = new LinkedList<Node>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		
		nodes.add(root);
		counts.add(1);
		
		while (!nodes.isEmpty()) {
			Node current = nodes.remove();
			int count = counts.remove();
			
			if (current.left != null) {
				nodes.add(current.left);
				counts.add(count + 1);
			}
			
			if (current.right != null) {
				nodes.add(current.right);
				counts.add(count + 1);
			}
			
			if (current.left == null && current.right == null)
				return count;
		}
		
		return 0;
	}
}