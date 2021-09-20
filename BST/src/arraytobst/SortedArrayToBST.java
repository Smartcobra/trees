package arraytobst;

import arraytobst.BinaryTreeNode;

public class SortedArrayToBST {

    public BinaryTreeNode<Integer> getBST(int arr[]){
        int end= arr.length;
        int start=0;
        BinaryTreeNode<Integer> root= getBSTHelper(arr, start, end-1);
        return root;

    }

    private BinaryTreeNode<Integer> getBSTHelper(int[] arr, int start, int end) {
        if(start>end){
            return null;
        }

        int mid=start+(end-start)/2;
        BinaryTreeNode<Integer> tmp= new BinaryTreeNode<>(arr[mid]);
        tmp.left=getBSTHelper(arr,start,mid-1);
        tmp.right=getBSTHelper(arr,mid+1,end);
        return tmp;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        SortedArrayToBST st= new SortedArrayToBST();
        BinaryTreeNode<Integer> bst = st.getBST(arr);
        PrintLevelWise print= new PrintLevelWise();
        // print.printLevel(bst);
        print.inOrder(bst);
    }

}