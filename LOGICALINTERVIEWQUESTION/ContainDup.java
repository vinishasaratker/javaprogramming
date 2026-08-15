import java.util.*;

class ContainDup {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        int arr[] = {3, 4, 2, 5, 6, 7, 5, 3, 2};

        boolean duplicate = false;

        for (int x : arr) {

            if (hs.contains(x)) {
                duplicate = true;
                break;
            } 
            else {
                hs.add(x);
            }
        }

        if (duplicate) {
            System.out.println("Duplicate exists");
        } 
        else {
            System.out.println("Duplicate does not exist");
        }
    }
}