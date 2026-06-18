package ArrayList.LinkedList;

import java.util.LinkedList;

public class KeyIterativeSearch {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addElement(int data) {
        // create new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {// O(n)
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ITERATIVE SEARCH
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("found ");
                return i;
            }

            temp = temp.next;
            i++;
            return -1;
        }
        return 0;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {

            return idx - 1;
        }
        return idx + 1;
    }

    public int recSerch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        KeyIterativeSearch ll = new KeyIterativeSearch();
        ll.addElement(20);
        ll.addElement(30);
        ll.addElement(40);
        ll.addElement(50);
        ll.print();
        System.out.println();
        ll.itrSearch(50);
        System.out.println("  by recursive search " + ll.recSerch(30));
        System.out.println("  recursion search " + ll.recSerch(33));
    }
}
