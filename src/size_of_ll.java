import LinkedList.addingAtFirst;

import java.util.LinkedList;

public class size_of_ll {
    public static class Node{
        int data;
        addingAtFirst.Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static addingAtFirst.Node head;
        public static addingAtFirst.Node tail;
        public static int size;

        //creating a new node
        public void addFirst(int data){
            size++;
            addingAtFirst.Node newNode = new addingAtFirst.Node(data);
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
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);

        System.out.println(ll.size());
    }
}
