package operations;

import create.CreateTreeNode;
import create.TreeNode;

public class PostOrder {
    public void getPostOrder(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        getPostOrder(root.leftChild);
        getPostOrder(root.rightChild);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        CreateTreeNode cn= new CreateTreeNode();
        create.TreeNode<Integer> binaryTree = cn.createBinaryTree();
        PostOrder po= new PostOrder();
        po.getPostOrder(binaryTree);
    }
}
