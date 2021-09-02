package Operation;

public class TreeSize {
    public int getSize(TreeNode<Integer> root) {
        if(root==null){
            return 0; /////this is not the base case
        }
        int size = 1;
        for (int i = 0; i < root.children.size(); i++) {
            size = size + getSize(root.children.get(i));
        }
        return size;
    }

    public static void main(String[] args) {
        Tree tn= new Tree();
        TreeNode<Integer> tree = tn.createTree();
        TreeSize ts= new TreeSize();
        System.out.println(ts.getSize(tree));
    }
}
