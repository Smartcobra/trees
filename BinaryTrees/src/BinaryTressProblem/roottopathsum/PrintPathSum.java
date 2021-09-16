package BinaryTressProblem.roottopathsum;


import BinaryTressProblem.printlevelwise.PrintLevelWise;

public class PrintPathSum {
    public void printPathSum(BinaryTreeNode<Integer> root, int k) {
        printPathSumHelper(root, 0, "", k);
    }

    private void printPathSumHelper(BinaryTreeNode<Integer> root, int curSum, String path, int k) {
/*        PrintLevelWise print= new PrintLevelWise();
        print.printBinaryTree(root);*/

        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            curSum += root.data;
              if(curSum==k){
                  System.out.println(path+root.data+" ");
              }
              return;
        }
        printPathSumHelper(root.left,(curSum+root.data),(path+root.data+" "),k);
        printPathSumHelper(root.right,(curSum+root.data),(path+root.data+" "),k);
    }

    public static void main(String[] args) {
        CreateBinaryTree ct= new CreateBinaryTree();
        BinaryTreeNode<Integer> root = ct.createTree();
        int k=12;
        PrintPathSum ps= new PrintPathSum();
        ps.printPathSum(root,k);

    }
}
