package TreeLevelWise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeInputAndPrint_LevelWise {

    public static TreeNode<Integer> createTree() throws QueueIsEmptyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter root data");
        int rootData = sc.nextInt();

        QueueUsingLinkedList<TreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enQueue(root);


        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontEnd = pendingNodes.deQueue();
            System.out.println("Please enter number of children for "+frontEnd.data);

            int numChildren=sc.nextInt();//will take number of children
            for(int i=0; i<numChildren;i++){
                System.out.println("please enter the "+i+"th child of "+frontEnd.data);
                int chileData=sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(chileData);
                frontEnd.children.add(childNode);
                pendingNodes.enQueue(childNode);
            }
        }
        return root;
    }
    ///print levelwise
    public static void levelOrderTraversal(TreeNode<Integer> root) throws QueueIsEmptyException {
        QueueUsingLinkedList<TreeNode<Integer>> queue = new QueueUsingLinkedList<>();
        queue.enQueue(root);


        List<List<Integer>> levelList = new ArrayList<>();

        while(!queue.isEmpty()){
         int n= queue.size();
            List<Integer> level= new ArrayList<>();

            while(n-- >0){
                TreeNode<Integer> currentNode=queue.deQueue();
                level.add(currentNode.data);
                List<TreeNode<Integer>> children=currentNode.children;
                for(int i=0;i<children.size();i++){
                    queue.enQueue(children.get(i));
                }
            }

            levelList.add(level);
        }
        levelList.stream().flatMap(List::stream).collect(Collectors.toList()).stream().forEach(t->System.out.print(t+" "));

    }

    public static void main(String[] args) throws QueueIsEmptyException {
        TreeNode<Integer> root=createTree();
        levelOrderTraversal(root);
    }

}
