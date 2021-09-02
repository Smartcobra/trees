package Operation;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal2 {

    public List<Integer> postOrderTraversal(TreeNode<Integer> root){
        List<Integer> list= new LinkedList<>();
        if(root==null){
            return list;
        }
        postOrderHelper(root,list);

        return list;
    }

    private void postOrderHelper(TreeNode<Integer> root, List<Integer> list) {

        if(root==null){
            return;
        }
        if(root.children !=null){
            for (TreeNode node :root.children){
                postOrderHelper(node,list);
            }
        }
        list.add(root.data);
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        //TreeNode<Integer> root=tree.createTree();
        TreeNode<Integer> root=tree.createTree2();
        PostOrderTraversal2  ln= new PostOrderTraversal2();
        List<Integer> integers = ln.postOrderTraversal(root);
        integers.stream().forEach(t->System.out.print(t+" "));
    }




}
