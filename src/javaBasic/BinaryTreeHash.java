package javaBasic;


public class BinaryTreeHash {

    public Object value;
    private BinaryTreeHash leftChild;
    private BinaryTreeHash rightChild;

 
    public BinaryTreeHash(Object value, BinaryTreeHash leftChild, BinaryTreeHash rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public BinaryTreeHash(Object value) {
        this(value, null, null);
    }
    public Object getValue() {
        return value;
    }
    public BinaryTreeHash getLeftChild() {
        return leftChild;
    }
    public BinaryTreeHash getRightChild() {
        return rightChild;
    }
    public void setLeftChild(BinaryTreeHash subtree) throws IllegalArgumentException {
        if (contains(subtree, this)) {
            throw new IllegalArgumentException(
                "Subtree " + this +" already contains " + subtree);
        }
        leftChild = subtree;
    }
    public void setRightChild(BinaryTreeHash subtree) throws IllegalArgumentException {
        if (contains(subtree, this)) {
            throw new IllegalArgumentException(
                    "Subtree " + this +" already contains " + subtree);
        }
        rightChild = subtree;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }
    public boolean equals(Object o) {
        if (o == null || !(o instanceof BinaryTreeHash)) {
            return false;
        }
        BinaryTreeHash otherTree = (BinaryTreeHash) o;
        return equals(value, otherTree.value)
            && equals(leftChild, otherTree.getLeftChild())
            && equals(rightChild, otherTree.getRightChild());
    }
    private boolean equals(Object x, Object y) {
        if (x == null) return y == null;
        return x.equals(y);
    }
    protected boolean contains(BinaryTreeHash tree, BinaryTreeHash targetNode) {
        if (tree == null)
            return false;
        if (tree == targetNode)
            return true;
        return contains(targetNode, tree.getLeftChild())
            || contains(targetNode, tree.getRightChild());
    }
    public String toString() {
        if (isLeaf()) {
            return value.toString();
        }
        else {
            String root, left = "null", right = "null";
            root = value.toString();
            if (getLeftChild() != null) {
                left = getLeftChild().toString();
            }
            if (getRightChild() != null) {
                right = getRightChild().toString();
            }
            return root + " (" + left + ", " + right + ")";
        }
    }
    public int hashCode() {
        int result = value.hashCode();
        if (leftChild != null) {
            result += 3 * leftChild.hashCode();
        }
        if (rightChild != null) {
            result += 7 * leftChild.hashCode();
        }
        return result;
    }
    public void print() {
        print(this, 0);
    }
    
    private void print(BinaryTreeHash root, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("   ");
        }
        if (root == null) {
            System.out.println("null");
            return;
        }
        System.out.println(root.value);
        if (root.isLeaf()) return;
        print(root.leftChild, indent + 1);
        print(root.rightChild, indent + 1);
    }
}
