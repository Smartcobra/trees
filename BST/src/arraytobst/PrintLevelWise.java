package arraytobst;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {

    public void printLevel(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> tmp= queue.poll();
            System.out.print(tmp.data +" ");

            if(tmp.left !=null) {
                queue.add(tmp.left);
            }
            if(tmp.right !=null) {
                queue.add(tmp.right);
            }
        }

    }


    public void inOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);


    }
}
