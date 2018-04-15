package BinarySearchTree;

public class ValidateBST {
	public static boolean validateBST(Node root) {
		return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean validateBST(Node root, int min, int max) {
		if (root == null)
			return true;
		
		if (root.value <= min || root.value >= max)
			return false;
		
		return validateBST(root.left, min, root.value) && validateBST(root.right, root.value, max);
	}
}