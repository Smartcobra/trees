package create;

import java.util.Scanner;

public class BuildTreeUserInput {

    public TreeNode<Integer> takeInput() {
        System.out.println("Please Enter root data:");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }

        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        TreeNode<Integer> rootLeftChild = takeInput();
        TreeNode<Integer> rootRightChild = takeInput();
        root.leftChild = rootLeftChild;
        root.rightChild = rootRightChild;

        return root;
    }

    ///////////better way/////////////
    public TreeNode<Integer> takeInput(boolean isRoot,boolean isLeftChild,int data){

        if(isRoot){
            System.out.println("Please Enter RootData");
        }else if(isLeftChild){
            System.out.println("Please enter LeftChild:" +data);
        }else{
            System.out.println("Please enter RightChild:"+data);
        }

        Scanner sc= new Scanner(System.in);
        int rootData= sc.nextInt();

         if(rootData==-1){
             return null;
         }
         TreeNode<Integer> root= new TreeNode<>(rootData);
         TreeNode<Integer> leftChild=takeInput(false,true,rootData);
         TreeNode<Integer> rightChild=takeInput(false,false,rootData);
         root.leftChild=leftChild;
         root.rightChild=rightChild;

         return root;

    }

    public static void main(String[] args) {
        BuildTreeUserInput bi= new BuildTreeUserInput();
        //TreeNode<Integer> integerTreeNode = bi.takeInput();
        TreeNode<Integer> integerTreeNode = bi.takeInput(true,false,0);
        PrintTrees pt= new PrintTrees();
       // pt.printTree2(integerTreeNode);
        pt.printTree2(integerTreeNode);
    }
}
