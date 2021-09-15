package BinaryTressProblem.createinsertduplicate;


import BinaryTressProblem.printlevelwise.PrintLevelWise;

public class CreateAndInsertDuplicateToLeft {

    public TreeNode<Integer> insertDuplicateLeft(TreeNode<Integer> root){
        if(root==null){
            return null;
        }
        TreeNode<Integer> newNode= new TreeNode<Integer>(root.data);
        TreeNode<Integer> rootLeft= root.left;
        root.left=newNode;
        newNode.left=rootLeft;

        insertDuplicateLeft(rootLeft);
        insertDuplicateLeft(root.right);

        return root;
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        CreateAndInsertDuplicateToLeft ci= new CreateAndInsertDuplicateToLeft();
        TreeNode<Integer> integerTreeNode = ci.insertDuplicateLeft(tree);
        PrintLevelWise print= new PrintLevelWise();
        print.printTree(integerTreeNode);

    }
}
