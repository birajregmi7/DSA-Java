package LinkedList;
import java.util.LinkedList;
public class addingAtFirst {
    public static class Node{
        int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;

        //creating a new node
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
        }
            // newNode next  = head; giving address of head to newnode next
            newNode.next = head;

            // passing the address of new node to head
            head  = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList ll  = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);

    }
}
