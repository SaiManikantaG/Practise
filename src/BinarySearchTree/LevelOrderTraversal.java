package BinarySearchTree;

import java.util.ArrayList;

public class LevelOrderTraversal {
	public static ArrayList<ArrayList<Integer>> levelOrderTraversal(Node root) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		levelOrderTraversal(root, lists, 0);
		return lists;
	}
	
	public static void levelOrderTraversal(Node root, ArrayList<ArrayList<Integer>> lists, int level) {
		if (root == null)
			return;
		
		ArrayList<Integer> list = null;
		
		if (lists.size() == level) {
			list = new ArrayList<Integer>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		
		list.add(root.value);
		
		levelOrderTraversal(root.left, lists, level + 1);
		levelOrderTraversal(root.right, lists, level + 1);
	}
}