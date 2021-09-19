package search;

public class CreateBinaryTree {
    public BinaryTreeNode<Integer> createTree() {


      /*    *********isPresent***********
       BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(12);
        root.left = new BinaryTreeNode<Integer>(10);
        root.left.left = new BinaryTreeNode<Integer>(8);
        root.left.right = new BinaryTreeNode<Integer>(11);

        root.right = new BinaryTreeNode<Integer>(16);
        root.right.left = new BinaryTreeNode<Integer>(13);
        root.right.right = new BinaryTreeNode<Integer>(17);
*/

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(60);
        root.left = new BinaryTreeNode<Integer>(30);
        root.left.left = new BinaryTreeNode<Integer>(10);
        root.left.right = new BinaryTreeNode<Integer>(40);

        root.right = new BinaryTreeNode<Integer>(70);
        root.right.left = new BinaryTreeNode<Integer>(50);
        root.right.right = new BinaryTreeNode<Integer>(80);

        return root;
    }

}
