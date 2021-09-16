package BinaryTressProblem.roottopathsum;

public class CreateBinaryTree {
    public BinaryTreeNode<Integer> createTree() {

       /* BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode<Integer>(8);
        root.right = new BinaryTreeNode<Integer>(2);
        root.left.left = new BinaryTreeNode<Integer>(3);
        root.left.right = new BinaryTreeNode<Integer>(5);
        root.right.left = new BinaryTreeNode<Integer>(2);*/

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(6);
        root.left = new BinaryTreeNode<Integer>(3);
        root.right = new BinaryTreeNode<Integer>(2);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(5);
        root.right.left = new BinaryTreeNode<Integer>(4);
        root.right.right = new BinaryTreeNode<Integer>(1);
        root.right.left.left= new BinaryTreeNode<Integer>(1);
        root.right.right.right = new BinaryTreeNode<Integer>(8);
        root.right.right.left = new BinaryTreeNode<Integer>(3);
        root.left.left.left = new BinaryTreeNode<Integer>(2);


        return root;
    }

}
