package create;

public class PrintTrees {

    public void printTree(TreeNode<Integer> root){
          if(root ==null){
              return;
          }
        System.out.println(root.data);
        printTree(root.leftChild);
        printTree(root.rightChild);
    }

    public void printTree2(TreeNode<Integer> root){
        if(root ==null){
            return;
        }
        //System.out.println(root.data +" :L-"+root.leftChild.data+", " +"R-"+root.rightChild.data);
        System.out.print(root.data +":");
        if(root.leftChild !=null){
            System.out.print("L"+root.leftChild.data+",");
        }
        if(root.rightChild !=null){
            System.out.print("R"+root.rightChild.data);
        }
        System.out.println();

        printTree2(root.leftChild);
        printTree2(root.rightChild);
    }

    public static void main(String[] args) {
        CreateTreeNode cn= new CreateTreeNode();
        TreeNode<Integer> binaryTree = cn.createBinaryTree();

        PrintTrees pt= new PrintTrees();
        pt.printTree2(binaryTree);


    }
}
