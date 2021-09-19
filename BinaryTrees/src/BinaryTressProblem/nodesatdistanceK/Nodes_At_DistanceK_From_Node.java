package BinaryTressProblem.nodesatdistanceK;

public class Nodes_At_DistanceK_From_Node {

    public int getNodesAtDistanceK(BinaryTreeNode<Integer> root, int element, int distance) {

        if (root == null) {
            return -1;
        }
        if (root.data == element) {
            getNodesAtDepthK(root, distance);
            return 0;
        }
        int leftD = getNodesAtDistanceK(root.left, element, distance);
        if (leftD != -1) {  // we can move further in left  //check the present distance// if ok print
            if (leftD + 1 == distance) {
                System.out.println(root.data);
            } else {  /// the distance remain is k-(ld+1)  // and if we move towards right then consume 1 more distance // so k-(ld+)-1
                getNodesAtDepthK(root.right, distance - leftD - 2);
            }
            return 1 + leftD;
        }

        int rightD = getNodesAtDistanceK(root.right, element, distance);
        if (rightD != -1) {  // we can move further in left  //check the present distance// if ok print
            if (rightD + 1 == distance) {
                System.out.println(root.data);
            } else {  /// the distance remain is k-(ld+1)  // and if we move towards left then consume 1 more distance // so k-(ld+)-1
                getNodesAtDepthK(root.left, distance - rightD - 2);
            }
            return 1 + rightD;
        }

        return -1;
    }

    private void getNodesAtDepthK(BinaryTreeNode<Integer> root, int distance) {
        if (root == null) {
            return;
        }
        if (distance == 0) {
            System.out.println(root.data);
            return;
        }
        getNodesAtDepthK(root.left, distance - 1);
        getNodesAtDepthK(root.right, distance - 1);
    }

    public static void main(String[] args) {
        CreateBinaryTree ct= new CreateBinaryTree();
        BinaryTreeNode<Integer> root = ct.createTree();
        Nodes_At_DistanceK_From_Node nd= new Nodes_At_DistanceK_From_Node();
        nd.getNodesAtDistanceK(root,3,3);
    }
}
