package operations;

public class LargestNodeData {
    public int getLargest(TreeNode<Integer> root){
        if(root==null){
            return  -1;
        }
        int largestLeft=getLargest(root.left);
        int largestRight=getLargest(root.right);
        return  Math.max(root.data,Math.max(largestLeft,largestRight));
    }

    public static void main(String[] args) {
        CreateTree ct= new CreateTree();
        TreeNode<Integer> tree = ct.createTree();
        LargestNodeData lr= new LargestNodeData();
        System.out.println(lr.getLargest(tree));

    }
}
