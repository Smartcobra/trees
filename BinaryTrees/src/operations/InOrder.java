package operations;

import create.CreateTreeNode;
import create.TreeNode;

public class InOrder {
    public void getInorder(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        getInorder(root.leftChild);
        System.out.println(root.data);
        getInorder(root.rightChild);

    }
    public static void main(String[] args) {
        CreateTreeNode cn= new CreateTreeNode();
        create.TreeNode<Integer> binaryTree = cn.createBinaryTree();
        InOrder io= new InOrder();
        io.getInorder(binaryTree);
    }
}
