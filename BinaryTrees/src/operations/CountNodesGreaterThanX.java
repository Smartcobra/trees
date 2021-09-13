package operations;

public class CountNodesGreaterThanX {

    public int countNodes(TreeNode<Integer> root,int x){
        if(root==null){
            return 0;
        }

        int count= (root.data>x)?1:0;
        if(root.left !=null){
            count +=countNodes(root.left,x);
        }
        if(root.right !=null){
            count +=countNodes(root.right,x);
        }
        return  count;
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        CountNodesGreaterThanX cx= new CountNodesGreaterThanX();
        System.out.println(cx.countNodes(tree,20));

    }
}
