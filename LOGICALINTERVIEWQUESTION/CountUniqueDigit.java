import java.util.*;
 class CountUniqueDigit{

static void countunique(int arr[]){
    HashSet<Integer> hs=new HashSet<>();
 
        for(int x:arr){
        hs.add(x);
         }
      System.out.println(hs);
      System.out.println(" unique digit are:"+ hs.size());
}
static void firstnonRepeating( int arr2[]){
 HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : arr2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Find first element with frequency 1
        for (int x : arr2) {

            if (map.get(x) == 2) {
                System.out.println(x);
                break;
       }
        }
        }




public static void main(String[]args){
 int[] arr = {1, 2, 2, 3, 3, 4};
 countunique(arr);
 int arr2[]={1,1,2,3,5,4,5,6,7,8};
 firstnonRepeating(arr2);
}

}