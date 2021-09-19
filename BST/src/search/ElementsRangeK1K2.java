package search;

public class ElementsRangeK1K2 {
    public void findElements(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && k2 >= root.data) {
            {
                System.out.print(root.data +" ");
                findElements(root.left, k1, k2);
                findElements(root.right, k1, k2);
            }
            if (k1 > root.data) {
                findElements(root.right, k1, k2);
            }

            if (k2 < root.data) {
                findElements(root.left, k1, k2);
            }

        }

    }

    public static void main(String[] args) {
        CreateBinaryTree ct = new CreateBinaryTree();
        BinaryTreeNode<Integer> root = ct.createTree();
        ElementsRangeK1K2 find= new ElementsRangeK1K2();
        find.findElements(root,20,60);
    }


}
