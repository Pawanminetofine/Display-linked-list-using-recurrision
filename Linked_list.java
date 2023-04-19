package Linkedlist;
import java.util.*;
public class Linked_list {
    public static void arrange(Node head){
        if (head==null) return;
        System.out.print(head.data +" ");
        arrange(head.next);
    }
    public static class Node {
        int data;//value
        Node next;//address of the next node
        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(5);
        Node c = new Node(2);
        Node d = new Node(9);
        Node e = new Node(8);
        Node f = new Node(18);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        arrange(a);
    }
}