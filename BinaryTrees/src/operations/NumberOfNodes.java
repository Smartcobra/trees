package operations;

public class NumberOfNodes {

    public int getNodeSize(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int lefSize=getNodeSize(root.left);
        int rightSize=getNodeSize(root.right);
        return 1+lefSize+rightSize;
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        NumberOfNodes nn= new NumberOfNodes();
        System.out.println( "Size is:: "+nn.getNodeSize(tree));
    }
}
