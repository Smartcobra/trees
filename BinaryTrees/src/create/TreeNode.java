package create;

public class TreeNode<T> {
   public  T data;
    public TreeNode<T> leftChild;
    public TreeNode<T> rightChild;

    TreeNode(T data){
        this.data=data;
    }
}
