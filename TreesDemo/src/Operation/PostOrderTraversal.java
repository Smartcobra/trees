package Operation;

public class PostOrderTraversal {

    public void postOrderTraversal(TreeNode<Integer> root){
        if(root==null){
            System.out.println(-1);
            return;
        }

        if(root.children!=null){
            for (TreeNode node :root.children){
                postOrderTraversal(node);
            }

        }
        System.out.print(root.data +" ");
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        //TreeNode<Integer> root=tree.createTree();
        TreeNode<Integer> root=tree.createTree2();
        PostOrderTraversal  ln= new PostOrderTraversal();
        ln.postOrderTraversal(root);
    }
}
