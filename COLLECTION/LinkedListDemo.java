import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("vimi");
        list.add("motu");
        list.add("radha");
        System.out.println(list);
        list.removeLast();
        System.out.println("remove elements are "+list);
        list.add(2,"mahi");
        System.out.println("update is "+list);
    }
}