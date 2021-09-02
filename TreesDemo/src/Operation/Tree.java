package Operation;

public class Tree {
    public TreeNode<Integer> createTree(){
        int rootData=1;  //level-1
        TreeNode<Integer> root =new TreeNode<>(rootData);  //level-2
        root.children.add(new TreeNode<>(2));  //0
        root.children.add(new TreeNode<>(3));   //1
        root.children.add(new TreeNode<>(4));  //2
        root.children.add(new TreeNode<>(5));   //3

        //add child to node -2     //level-3
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

        ///children of 6   //level-4
        root.children.get(0).children.get(0).children.add(new TreeNode<>(66));
        root.children.get(0).children.get(0).children.add(new TreeNode<>(67));
        root.children.get(0).children.get(0).children.add(new TreeNode<>(68));

        return root;
    }

    public TreeNode<Integer> createTree2(){
        int rootData=10;  //level-1
        TreeNode<Integer> root =new TreeNode<>(rootData);  //level-1

        root.children.add(new TreeNode<>(20));  //0
        //root.children.add(new TreeNode<>(30));   //1
        //root.children.add(new TreeNode<>(40));  //2
       // System.out.println(root.children.get(0).data);
        root.children.get(0).children.add(new TreeNode<>(200));
        root.children.get(0).children.add(new TreeNode<>(201));
        root.children.get(0).children.add(new TreeNode<>(203));

        return root;
    }

}
