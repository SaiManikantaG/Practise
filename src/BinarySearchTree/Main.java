package BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println(PreOrderTraversal.preOrderTraversal(root).toString());
		System.out.println(InOrderTraversal.inOrderTraversal(root).toString());
		System.out.println(PostOrderTraversal.postOrderTraversal(root).toString());
		System.out.println(LevelOrderTraversal.levelOrderTraversal(root).toString());
		System.out.println(ValidateBST.validateBST(root));
	}
}