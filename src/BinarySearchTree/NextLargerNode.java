package BinarySearchTree;

public class NextLargerNode {
	public static Node nextLargerNode(Node root, Node n) {
		if (n.right != null)
			return minValue(n.right);
		
		Node succ = null;
		
		while (root != null) {
			if (n.value < root.value) {
				succ = root;
				root = root.left;
			} else if (n.value > root.value) {
				root = root.right;
			} else {
				break;
			}
		}
		
		return succ;
	}
	
	public static Node nextLargerNode2(Node root, Node n) {
		if (n.right != null)
			return minValue(n.right);
		
		Node p = n.parent;
		
		while (p != null && n == p.right) {
			n = p;
			p = p.parent;
		}
		
		return p;
	}
	
	public static Node minValue(Node node) {
		Node current = node;
		
		while (current.left != null)
			current = current.left;
		
		return current;
	}
	
	public static Node insert(Node node, int value) {
		if (node == null) {
			return new Node(value);
		} else {
			Node temp;
			
			if (value <= node.value) {
				temp = insert(node.left, value);
				node.left = temp;
				temp.parent = node;
			} else {
				temp = insert(node.right, value);
				node.right = temp;
				temp.parent = node;
			}
			
			return node;
		}
	}
	
	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 20);
		root = insert(root, 8);
		root = insert(root, 22);
		root = insert(root, 4);
		root = insert(root, 12);
		root = insert(root, 10);
		root = insert(root, 14);
		Node temp = root.left.right.right;
		
		Node succ = nextLargerNode(root, temp);
		System.out.println(succ.value);
		
		succ = nextLargerNode2(root, temp);
		System.out.println(succ.value);
	}
}