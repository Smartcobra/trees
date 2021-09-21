package checkbst;

public class CreateBinaryTree {
    public BinaryTreeNode<Integer> createTree() {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(60);
        root.left = new BinaryTreeNode<Integer>(30);
        root.left.left = new BinaryTreeNode<Integer>(10);
        root.left.right = new BinaryTreeNode<Integer>(40);

        root.right = new BinaryTreeNode<Integer>(70);
        root.right.left = new BinaryTreeNode<Integer>(65);
        root.right.right = new BinaryTreeNode<Integer>(80);

        return root;
    }

}
