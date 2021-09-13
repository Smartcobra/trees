package create;

public class CreateTreeNode {

    public TreeNode<Integer> createBinaryTree(){
        TreeNode<Integer> root= new TreeNode<>(1);

        TreeNode<Integer> rootLeft= new TreeNode<>(2);
        TreeNode<Integer> rootRight= new TreeNode<>(3);
        root.leftChild=rootLeft;
        root.rightChild=rootRight;

        TreeNode<Integer> twosRight= new TreeNode<>(4);
        TreeNode<Integer> threesLeft= new TreeNode<>(5);
        rootLeft.rightChild=twosRight;
        rootRight.leftChild=threesLeft;

        return root;


    }
}
