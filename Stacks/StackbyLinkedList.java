package Stacks;

public class StackbyLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {

        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // Push
        public static void push(int data) {

            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Pop
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek
        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(5);
        st.push(6);
        st.push(8);

        while (!st.isEmpty()) {
            // System.out.println("Peek : " + st.peek());
            System.out.println("Pop  : " + st.pop());
        }
    }
}