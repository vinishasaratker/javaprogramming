package ArrayList;

import java.util.ArrayList;
import java .util.Collections;

public class MonotoniQue {

    public static boolean monotonicArray(ArrayList<Integer> list){

        boolean increasing = true;
        boolean dec = true;

        for(int i=0; i<list.size()-1; i++){

            if(list.get(i) > list.get(i+1))
                increasing = false;

            if(list.get(i) < list.get(i+1))
                dec = false;
        }
// agr increasing ya decreasing dono me se ek  bhi true hai to answer will be true 
        return increasing || dec;
    }

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        Collections.sort(nums);

        int n = nums.size();

        for (int i = 0; i < n; i++) {

            boolean isLonely = true;

            // Check duplicate on left
            if (i > 0 && nums.get(i).equals(nums.get(i - 1))) {
                isLonely = false;
            }

            // Check duplicate on right
            if (i < n - 1 && nums.get(i).equals(nums.get(i + 1))) {
                isLonely = false;
            }

            // Check x-1
            if (i > 0 && nums.get(i) - nums.get(i - 1) == 1) {
                isLonely = false;
            }

            // Check x+1
            if (i < n - 1 && nums.get(i + 1) - nums.get(i) == 1) {
                isLonely = false;
            }

            if (isLonely) {
                ans.add(nums.get(i));
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        
        
        list.add(1);

        list.add(2);

        list.add(3);
        list.add(0);

        System.out.println(monotonicArray(list));
        
      ArrayList<Integer> nums=new ArrayList<>();
       nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
System.out.println(findLonely(nums));
    }
}