import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(10);
        list.add(90);
        list.add(56);
        list.add(54);

        ListIterator<Integer> ltr = list.listIterator();
       System.out.println("Print elements in forward direction");
         while (ltr.hasNext()) {
            int x = ltr.next();

            if (x == 5) {
                ltr.remove();
            }
            else if (x == 10) {
                ltr.set(111);
            }
            else if (x == 54) {
                ltr.add(999);
            }
        System.out.println("\t===>" + x);
        }

        System.out.println("Updated List: " + list);
       System.out.println("Print elements in backward direction");

        while (ltr.hasPrevious()) {
            System.out.println("\t===>" + ltr.previous());
        }
    }
}