package operations;



public class SumOfAllNode {

    public int getNodeSum(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftSUM=getNodeSum(root.left);
        int rightSUM=getNodeSum(root.right);
        return root.data+leftSUM+rightSUM;

    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        SumOfAllNode sn= new SumOfAllNode();
        System.out.println( "Size is:: "+sn.getNodeSum(tree));
    }
}
