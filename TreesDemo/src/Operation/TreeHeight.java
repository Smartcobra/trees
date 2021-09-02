package Operation;

public class TreeHeight {
    public int getTreeHeight(TreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }

        int maxHeight=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<root.children.size();i++){
            maxHeight=getTreeHeight(root.children.get(i));
                    if(maxHeight>max){
                        max=maxHeight;
                    }
        }
        return maxHeight+1;

       /*for(TreeNode tn:root.children){
           maxHeight=Math.max(maxHeight,getTreeHeight(tn));
       }
        return maxHeight+1;*/
    }

    public static void main(String[] args) {
        Tree tree= new Tree();
        TreeNode<Integer> root= tree.createTree();
        TreeHeight treeHeight = new TreeHeight();
        System.out.println(treeHeight.getTreeHeight(root));
    }
}
