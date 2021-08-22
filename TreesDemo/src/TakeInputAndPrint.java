

import java.util.Scanner;
public class TakeInputAndPrint {



    public static TreeNode<Integer> takeInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the root data");
        int n=sc.nextInt();
        TreeNode<Integer> root= new TreeNode<Integer>(n);
        System.out.println("Please Enter the number child ");
        int childCount =sc.nextInt();

        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child=takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void printTree(TreeNode<Integer> root){
        String s= root.data+":";
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root=takeInput();
        ///System.out.println(root);
        printTree(root);
    }
}
