package BinarySearchTree;

public class BalancedBST {
	public static boolean isBalance(Node root) {
		if (root == null)
			return true;
		
		if (getHeight(root) == -1)
			return false;
		
		return true;
	}
	
	public static int getHeight(Node root) {
		if (root == null)
			return 0;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		if (left == -1 || right == -1)
			return -1;
		
		if (Math.abs(left - right) > 1)
			return -1;
		
		return Math.max(left, right) + 1;
	}
}