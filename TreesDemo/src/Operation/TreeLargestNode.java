package Operation;

public class TreeLargestNode {

    public int findLargest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;  //not the base condition
        }
        int max = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childMax = findLargest(root.children.get(i));

            if (childMax > max) {
                max = childMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Tree tn = new Tree();
        TreeNode<Integer> tree = tn.createTree();
        TreeLargestNode ts = new TreeLargestNode();
        System.out.println(ts.findLargest(tree));
    }

}
