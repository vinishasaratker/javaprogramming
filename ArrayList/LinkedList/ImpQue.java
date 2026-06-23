package ArrayList.LinkedList;

import java.util.LinkedList;

public class ImpQue {
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
    public static int size;

    public void addFirst(int data) {
        // step 1 create a node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        // --- STEP 2 . NEWNODE NEXT=HEAD linking process
        newNode.next = head;

        // --- step 3 head =new node
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

    // check a loop exists in a linkdlist or not -- here we use slow falst approach
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;// cycle exist krta hai

            }
        }

        return false; // cycledoes not exists
    }
    /// Remove loop from linkedlist

    public static void removeCycle() {
        // delete cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // finf point where loopis meeting
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cylce step
        prev.next = null;
    }

    public static void main(String[] args) {
        ADDmiddle ll = new ADDmiddle();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(34);
        ll.addFirst(56);
        ll.print();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        // 1->2->3->1 it is calledlinked loop
        System.out.println(" check loop exist or not ");
        System.out.println(isCycle());
        System.out.println("deleting  loop exisst ");
        removeCycle();
        System.out.println(isCycle());
    }
}
