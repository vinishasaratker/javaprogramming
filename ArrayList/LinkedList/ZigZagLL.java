package ArrayList.LinkedList;

public class ZigZagLL {

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

    // Add element at beginning
    public void addElement(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ZigZag Linked List
    public void zigZag() {

        if (head == null || head.next == null) {
            return;
        }

        // Find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate merge
        Node left = head;
        Node right = prev;

        while (left != null && right != null) {

            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        ZigZagLL ll = new ZigZagLL();

        ll.addElement(20);
        ll.addElement(30);
        ll.addElement(40);
        ll.addElement(50);
        ll.addElement(60);

        System.out.println("Before ZigZag:");
        ll.print();

        ll.zigZag();

        System.out.println("After ZigZag:");
        ll.print();
    }
}