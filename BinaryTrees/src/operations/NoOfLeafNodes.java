package operations;

public class NoOfLeafNodes {
    public int getNoLeafNode(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left ==null &&root.right==null){
            return 1;
        }

        return getNoLeafNode(root.left)+getNoLeafNode(root.right);
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        NoOfLeafNodes nn= new NoOfLeafNodes();
        System.out.println(nn.getNoLeafNode(tree));

    }
}
