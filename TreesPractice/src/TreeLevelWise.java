import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreeLevelWise {

    public static TreeNode<Integer> makeTree() throws QueueIsEmptyException {
        Scanner sc= new Scanner(System.in);
        int rootData= sc.nextInt();

        TreeNode<Integer> root= new TreeNode<>(rootData);
        QueueUsingLinkedList<TreeNode<Integer>> queue= new QueueUsingLinkedList<TreeNode<Integer>>();
        queue.enQueue(root);

        while(!queue.isEmpty()){
            TreeNode<Integer> frontEnd= queue.deQueue();
            System.out.println("Please enter number of Children for::" +frontEnd);
            int noChildren= sc.nextInt();
            for(int i=0;i<noChildren;i++){
                System.out.println("Please enter the"+i+ "th of Children for::" +frontEnd);
                int child= sc.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(child);  //form treenode using the data
                frontEnd.children.add(childNode);//connect to parent
                queue.enQueue(childNode); //enque

            }

        }
        return root;
    }
  ////print levelWise
    public static List<List<Integer>> levelWiseTrasverse(TreeNode<Integer> root) throws QueueIsEmptyException {
        QueueUsingLinkedList<TreeNode<Integer>> queue= new QueueUsingLinkedList<TreeNode<Integer>>();
        queue.enQueue(root);

        List<List<Integer>> nodes= new ArrayList<>();

        while(!queue.isEmpty()){
            //TreeNode<Integer> rootData=queue.deQueue();
            int n=queue.size();
            List<Integer> list= new ArrayList<>();

            while(n-- >0){
                TreeNode<Integer> currentNode=queue.deQueue();
                list.add(currentNode.data);
                List<TreeNode<Integer>> childList = currentNode.children;
                for(int i=0;i<childList.size();i++){
                    queue.enQueue(childList.get(i));
                }
            }
             nodes.add(list);
            nodes.stream().flatMap(List::stream).collect(Collectors.toList()).stream().forEach(System.out::println);
        }

   return nodes;
    }
}
