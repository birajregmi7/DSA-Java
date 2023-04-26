//package LinkedList;
//
//import java.util.LinkedList;
//
//public class printingLL {
//    public static class Node {
//        int data;
//        addingAtLast.Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//
//        public static addingAtLast.Node head;
//        public static addingAtLast.Node tail;
//
//        public void addLast(int data) {
//            //create new node
//            addingAtLast.Node newNode = new addingAtLast.Node(data);
//            if (head == null) {
//                head = tail = newNode;
//                return;
//            }
//            //tail.next is pointing to newNode
//            newNode = tail.next;
//            // pointing newNode next to tail
//            tail = newNode;
//        }
//        public void printt() {
//            Node temp = head;
//            while(temp != null) {
//                System.out.print(temp.data+"->");
//                temp = temp.next;
//            }
//            System.out.println("null");
//        }
//        public static void main(String[] args) {
//            LinkedList ll = new LinkedList();
//            ll.print();
//            ll.addLast(2);
//            ll.addLast(3);
//            ll.addLast(44);
//            System.out.println(ll);
//
//        }
//    }
//}
