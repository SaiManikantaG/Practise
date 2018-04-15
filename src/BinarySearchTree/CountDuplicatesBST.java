package BinarySearchTree;

public class CountDuplicatesBST {
	public static int countDuplicates(Node current, Node previous) {
		if (current == null)
			return 0;
		else {
			int count = 0;
			
			if (current.value == previous.value)
				count++;
			
			return count + countDuplicates(current.left, current) + countDuplicates(current.right, current);
		}
	}
}