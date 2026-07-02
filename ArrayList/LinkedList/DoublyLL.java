package ArrayList.LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class DoublyLL {

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {

        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("doubly linked list is empty");
            return -1;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }



public void addLast(int data) {

    Node newnode = new Node(data);
    size++;

    if (head == null) {
        head = tail = newnode;
        return;
    }

    tail.next = newnode;
    newnode.prev = tail;
    tail = newnode;
}
    public void removeLast() {

    if (head == null) {
        System.out.println("Doubly Linked List is empty");
        return;
    }

    if (size == 1) {
        head = tail = null;
        size--;
        return;
    }

    tail = tail.prev;
    tail.next = null;
    size--;
}



    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addFirst(9);
        dll.addFirst(8);
        dll.addFirst(7);
        System.out.println("add first doubly ll is :");
        dll.print();
        System.out.println("size is :" + size);
        dll.removeFirst();
        System.out.println("removed ll is ");
        dll.print();
        dll.addLast(89);
        System.out.println("add elements is last ");
        dll.print();
        dll.removeLast();
        System.out.println("remove element form last:");
        dll.print();
    }
}
