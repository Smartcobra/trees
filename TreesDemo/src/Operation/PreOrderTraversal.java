package Operation;


public class PreOrderTraversal {

    public void preOderTraversal(TreeNode<Integer> root){
        if(root==null){
            System.out.println(-1);
            return;
        }
        System.out.print(root.data+" ");

        for(int i=0;i<root.children.size();i++){
            preOderTraversal(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        TreeNode<Integer> root=tree.createTree();
        PreOrderTraversal  ln= new PreOrderTraversal();
        ln.preOderTraversal(root);
    }
}
