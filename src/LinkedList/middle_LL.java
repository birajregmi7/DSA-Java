package LinkedList;

import java.util.LinkedList;

public class middle_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode = tail.next;
            tail = newNode;
    }
        public void add(int idx, int data){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        temp = newNode;
        newNode.next = temp.next;
        }
    }
        public static void main(String[] args) {
        LinkedList ll = new LinkedList();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2,9);
            System.out.println(ll);
        }
    }
