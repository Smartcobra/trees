package BinaryTressProblem.nodesatdistanceK;

public class CreateBinaryTree {
    public BinaryTreeNode<Integer> createTree() {


        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(12);
        root.left = new BinaryTreeNode<Integer>(6);
        root.right = new BinaryTreeNode<Integer>(7);

        root.left.left = new BinaryTreeNode<Integer>(4);
        root.left.right = new BinaryTreeNode<Integer>(3);

        root.left.left.left = new BinaryTreeNode<Integer>(5);

        root.left.right.left = new BinaryTreeNode<Integer>(8);
        root.left.right.right = new BinaryTreeNode<Integer>(10);

        root.left.right.left.right= new BinaryTreeNode<Integer>(9);
        root.left.right.left.right.left= new BinaryTreeNode<Integer>(15);
        root.left.right.right.left = new BinaryTreeNode<Integer>(12);
        root.left.right.right.right = new BinaryTreeNode<Integer>(20);
        root.left.right.right.right.left = new BinaryTreeNode<Integer>(8);


        root.right.right = new BinaryTreeNode<Integer>(10);


        return root;
    }

}
