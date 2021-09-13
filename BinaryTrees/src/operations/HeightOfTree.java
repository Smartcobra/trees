package operations;

public class HeightOfTree {
    public int getHeight(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        HeightOfTree ht= new HeightOfTree();
        System.out.println(ht.getHeight(tree));

    }
}
