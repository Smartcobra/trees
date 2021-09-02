package Operation;

public class CountLeafNode {
    public int numberOfLeafNode(TreeNode<Integer> root){
        if(root==null){
            return -1;
        }

       int count=0;
        if(root.children.size()==0){
            return 1;
        }else{
            for(int i=0;i<root.children.size();i++){
                count +=numberOfLeafNode(root.children.get(i));

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        TreeNode<Integer> root=tree.createTree2();
        CountLeafNode  ln= new CountLeafNode();
        System.out.println(ln.numberOfLeafNode(root));
    }
}
