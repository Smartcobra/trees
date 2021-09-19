package search;

public class SearchInBST {
    public boolean isPresent(BinaryTreeNode<Integer> root, int element) {
        if (root == null) {
            return false;
        }
        if (root.data == element) {
            return true;
        } else if (root.data > element) {
            return isPresent(root.left, element);
        } else {
            return isPresent(root.right, element);
        }
    }

    public static void main(String[] args) {
        CreateBinaryTree ct = new CreateBinaryTree();
        BinaryTreeNode<Integer> root = ct.createTree();
        SearchInBST search= new SearchInBST();
        System.out.println(search.isPresent(root,22));
    }
}
