package LinkedList;

import java.util.LinkedList;

public class addingAtLast {
    public static class Node {
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
            }
            public static Node head;
            public static Node tail;

            public void addLast(int data){
                //create new node
                Node newNode = new Node(data);
                if (head == null){
                    head = tail = newNode;
                    return;
                }
                //tail.next is pointing to newNode
                newNode = tail.next;
                // pointing newNode next to tail
                tail = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(44);
        System.out.println(ll);

    }
}
