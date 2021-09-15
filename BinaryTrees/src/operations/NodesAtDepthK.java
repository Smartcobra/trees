package operations;

public class NodesAtDepthK {
    public void getNodes(TreeNode<Integer> root ,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        getNodes(root.left,k-1);
        getNodes(root.right,k-1);
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        NodesAtDepthK kt= new NodesAtDepthK();
        kt.getNodes(tree,2);
    }
}
