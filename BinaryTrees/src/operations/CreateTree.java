package operations;

public class CreateTree {
    public TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode<>(10);

        TreeNode<Integer> leftChild = new TreeNode<>(11);
        TreeNode<Integer> leftChild1 = new TreeNode<>(12);
        TreeNode<Integer> leftChild2 = new TreeNode<>(13);
        TreeNode<Integer> leftChild3 = new TreeNode<>(14);
        TreeNode<Integer> leftChild4 = new TreeNode<>(15);


        TreeNode<Integer> rightChild = new TreeNode<>(21);

        TreeNode<Integer> rightChild1 = new TreeNode<>(22);
        TreeNode<Integer> rightChild2 = new TreeNode<>(23);
        TreeNode<Integer> rightChild3 = new TreeNode<>(24);
        TreeNode<Integer> rightChild4 = new TreeNode<>(25);

        root.left = leftChild; //11
        root.right = rightChild;//21

        leftChild.left = leftChild1; //11-12
        leftChild.right = rightChild1;//11-22

        leftChild1.left = leftChild3;//12-14
        leftChild1.right = rightChild3;//12-24

        rightChild.left = leftChild2;////21-13
        rightChild.right = rightChild2;//21-23

        leftChild2.left = leftChild4;
        leftChild2.right = rightChild4;


        return root;
    }

    public void printTree2(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        //System.out.println(root.data +" :L-"+root.leftChild.data+", " +"R-"+root.rightChild.data);
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        printTree2(root.left);
        printTree2(root.right);
    }

    public static void main(String[] args) {
        CreateTree ct = new CreateTree();
        TreeNode<Integer> root = ct.createTree();
        ct.printTree2(root);
    }
}
