package lesson15;

public class BinaryTreeDemo {
    
    public static void main(String[] args) {

        // The Binary Tree for the CS Classroom
        BinaryTreeNode csTeacher = new BinaryTreeNode(true, "EC");
        csTeacher.setLeft(new BinaryTreeNode(false, "JB"));
        csTeacher.setRight(new BinaryTreeNode(false, "BSZ"));
        csTeacher.getLeft().setLeft(new BinaryTreeNode(false, "FT"));
        csTeacher.getRight().setRight(new BinaryTreeNode(false, "KP"));
        csTeacher.getRight().getRight().setRight(new BinaryTreeNode(false, "CL"));
        csTeacher.getRight().getRight().getRight().setLeft(new BinaryTreeNode(false, "Dennis"));
        csTeacher.getRight().getRight().getRight().setRight(new BinaryTreeNode(false, "D"));

        csTeacher.printInOrder();
        System.out.println(csTeacher.getPrintBuffer());
    }
}