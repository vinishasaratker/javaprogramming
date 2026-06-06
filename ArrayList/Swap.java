package ArrayList;
import java.util.Collections;
import java.util.ArrayList;
public class Swap {
 static void swap(ArrayList<Integer> List) {

        int idx1 = 3;
        int idx3 = 5;
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx3));
        List.set(idx3, temp);
        System.out.println("  sdwapped array ---"+List);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(9);
        List.add(7);
        List.add(8);
        List.add(67);
        List.add(45);
        List.add(3);
        List.add(12);
        System.out.println(List);
        System.out.println();
        System.out.println("sorted array==> in aschending order ");
      Collections.sort(List); 
      System.out.println(List);

      System.out.println();
      System.out.println(" shorted array in deschending order ");
      Collections.sort(List,Collections.reverseOrder());
      System.out.println();
        swap(List);
    }
}