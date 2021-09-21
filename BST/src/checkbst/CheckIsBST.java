package checkbst;

public class CheckIsBST {

    public boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int maxLeft = maximum(root.left);
        if (maxLeft >= root.data) {
            return false;
        }

        int minRight = minimum(root.right);
        if (minRight < root.data) {
            return false;
        }
        //checking left and right are both bst
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        return isLeftBST && isRightBST;

    }

    private int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int minLeft = minimum(root.left);
        int minRight = minimum(root.right);
        return Math.min(root.data, Math.min(minLeft, minRight));

    }

    private int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxLeft = maximum(root.left);
        int maxRight = maximum(root.right);

        return Math.max(root.data, Math.max(maxLeft, maxRight));
    }

    public static void main(String[] args) {
        CreateBinaryTree ct= new CreateBinaryTree();
        BinaryTreeNode<Integer> root = ct.createTree();
        CheckIsBST isBST= new CheckIsBST();
        boolean bst = isBST.isBST(root);
        System.out.println(bst);

    }

}
