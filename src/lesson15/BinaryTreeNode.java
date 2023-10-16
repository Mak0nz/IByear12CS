package lesson15;

public class BinaryTreeNode {
    
    // Data
    private boolean isRoot;

    private boolean isVisited;

    private boolean isParent;

    private String key; // In here we are storing "P", "C"

    private BinaryTreeNode left;

    private BinaryTreeNode right;
    
    // Constructor
    public BinaryTreeNode(boolean isRoot, String key) {
        this.isRoot = isRoot;
        this.key = key;
    }

    // Methods
    public boolean isLeafNode() {
        if (this.left == null && this.right == null) return true;
        return false;
    }

    public boolean isRoot() {
        return this.isRoot;
    }

    public boolean isParent() {
        if (this.left != null || this.right != null) {return true;} 
        else {return false;}
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return this.left;
    }

    public BinaryTreeNode getRight() {
        return this.right;
    }
    public void visit(){
        System.out.println(key);
        isVisited = true;
    }

    /**
     * Tree Node Traversals
     */
    public void printInorder()
    {
        if (isVisited == true) return;

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printInorder();
        }
        
        // call visit
        visit();
        
        /* Recur on the right */
        if (this.right != null) {
            this.right.printInorder();
        }
    }

    // postOrder
    public void printPostOrder(){
        if (isVisited == true) return;

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printPostOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPostOrder();
        }
        
        // call visit
        visit();
    }

    // preOrder
    public void printPreOrder(){
        if (!isVisited == true) {
            // call visit
            visit();
        }     

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printPreOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPreOrder();
        }   
    }

}