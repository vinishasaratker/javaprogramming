package Stacks;

import java.util.ArrayList;

public class StackbyArraylist {

    static class stackb {

        static ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push operation
        public static void push(int data) {
            list.add(data);
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        stackb sb = new stackb();

        sb.push(5);
        sb.push(6);
        sb.push(8);
        sb.push(89);

        sb.push(008);
        System.out.println("Elements popped from stack:");

        while (!sb.isEmpty()) {
            System.out.println("Peek : " + sb.peek());
            System.out.println("Pop  : " + sb.pop());
        }
    }
}