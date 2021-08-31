package size;

public class Tree {
    public TreeNode<Integer> createTree(){
        int rootData=1;
        TreeNode<Integer> root =new TreeNode<>(rootData);
        root.children.add(new TreeNode<>(2));
        root.children.add(new TreeNode<>(3));
        root.children.add(new TreeNode<>(4));
        root.children.add(new TreeNode<>(5));

        //add child to node -2
        root.children.get(0).children.add(new TreeNode<>(6));
        root.children.get(0).children.add(new TreeNode<>(7));
        root.children.get(0).children.add(new TreeNode<>(8));

        //add child to node -3
        root.children.get(1).children.add(new TreeNode<>(9));
        root.children.get(1).children.add(new TreeNode<>(10));
        root.children.get(1).children.add(new TreeNode<>(11));

        root.children.get(3).children.add(new TreeNode<>(30));
        root.children.get(3).children.add(new TreeNode<>(31));
        root.children.get(3).children.add(new TreeNode<>(32));

        ///children of 6
        root.children.get(0).children.get(0).children.add(new TreeNode<>(66));
        root.children.get(0).children.get(0).children.add(new TreeNode<>(67));
        root.children.get(0).children.get(0).children.add(new TreeNode<>(68));

        return root;
    }

}
