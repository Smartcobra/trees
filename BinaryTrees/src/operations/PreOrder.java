package operations;


import create.CreateTreeNode;
import create.TreeNode;

public class PreOrder {
    public void getPreOrder(TreeNode<Integer> root){
        if(root==null){
           // System.out.println();
            return;
        }
        System.out.println("data::" +root.data);
        getPreOrder(root.leftChild);
        getPreOrder(root.rightChild);

    }

    public static void main(String[] args) {
        CreateTreeNode cn= new CreateTreeNode();
        create.TreeNode<Integer> binaryTree = cn.createBinaryTree();
        PreOrder po= new PreOrder();
        po.getPreOrder(binaryTree);
    }
}
