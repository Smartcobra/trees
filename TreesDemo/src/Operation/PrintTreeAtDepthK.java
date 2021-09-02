package Operation;

public class PrintTreeAtDepthK {
    public void printDepthK(TreeNode<Integer> root,int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.print(root.data+"-");
            return;
        }
        for(int i=0;i<root.children.size();i++){
            printDepthK(root.children.get(i),k-1);
        }
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        TreeNode<Integer> root= tree.createTree();
        PrintTreeAtDepthK depthK = new PrintTreeAtDepthK();
        depthK.printDepthK(root,2);
    }

}
