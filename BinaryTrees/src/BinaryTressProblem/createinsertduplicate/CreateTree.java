package BinaryTressProblem.createinsertduplicate;

public class CreateTree {
    public TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode<>(10);

        TreeNode<Integer> leftChild = new TreeNode<>(20);
        TreeNode<Integer> rightChild = new TreeNode<>(30);


        TreeNode<Integer> leftChild20 = new TreeNode<>(40);
        TreeNode<Integer> rightChil20 = new TreeNode<>(50);

        TreeNode<Integer> rightChild30 = new TreeNode<>(60);


        root.left = leftChild; //20
        root.right = rightChild;//30

        leftChild.left = leftChild20; //40
        leftChild.right = rightChil20;//50


        rightChild.right = rightChild30;////60


        return root;
    }

}
