package ArrayList.LinkedList;

import java.util.LinkedList;

public class ADDmiddle {

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
    public static int size ;
    //// ------ADD IN FIRST

    public void addFirst(int data) {
        // step 1 create a node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size ++ ;
        // --- STEP 2 . NEWNODE NEXT=HEAD linking process
        newNode.next = head;

        // --- step 3 head =new node
        head = newNode;
    }

    // ---ADDING IN LAST
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size ++;
        tail.next = newNode;
        tail = newNode;
    }

    /// --- PRINTING =---
    public void print() {// O(n)
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        // create node
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
  size ++ ;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
      
        // i=idx-1 temp-> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println(" empty ");
        }
        else if(size==1){
            int val=head.data ;
            head=tail=null;
            return val ;
    
        }
        int val=head.data ;
        head=head.next;
        return val;
        
    }

    public static void main(String[] args) {
        ADDmiddle ll = new ADDmiddle();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addLast(44);
        ll.addLast(76);
        ll.addMiddle(2, 99);
        ll.print();
        System.out.println(size);
     ll.removeFirst();
     ll.print();

    }

}
