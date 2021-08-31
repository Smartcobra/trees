public class QueueUsingLinkedList<T> {  //used by treenode
    private ListNode<T> front;
    private ListNode<T> rear;
    private int size;

    QueueUsingLinkedList(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return  size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front() throws QueueIsEmptyException {
        if(isEmpty()){
            throw new QueueIsEmptyException();
        }return front.data;
    }

    public void enQueue(T element){
        ListNode<T> newNode= new ListNode<>(element);
       size++;
        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }


    }

    public T deQueue() throws QueueIsEmptyException {
        if(isEmpty()){
            throw new QueueIsEmptyException();
        }
        if(front==null){
            rear=null;
        }
        T ans=front.data;
        front=front.next;
        size--;

        return ans;
    }

    public static void main(String[] args) throws QueueIsEmptyException {
        //int [] arr={12,3,1,5,6,8,9,13,45,6,7,9,5,32};
        int [] arr={12,3,1,5,6,8,9,23,43,11,8,7,3,1,2};
        QueueUsingLinkedList<Integer> dq= new QueueUsingLinkedList<Integer>();
        for(int i :arr){
            dq.enQueue(i);
        }

        while(!dq.isEmpty()){
            System.out.print(dq.deQueue()+" ");
        }

    }

}
