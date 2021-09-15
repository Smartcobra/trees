package BinaryTressProblem.printlevelwise;



import BinaryTressProblem.createinsertduplicate.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
    public void printTree(TreeNode<Integer> root){

        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode<Integer> tmpNode=queue.poll();
            System.out.print(tmpNode.data+" ");

            if(tmpNode.left !=null){
                queue.add(tmpNode.left);
            }
            if(tmpNode.right !=null){
                queue.add(tmpNode.right);
            }
        }
    }
}
