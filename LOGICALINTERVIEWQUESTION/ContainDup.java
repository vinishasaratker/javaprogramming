import java.util.*;

class ContainDup {
    // public static void main(String[] args) {

    //     HashSet<Integer> hs = new HashSet<>();

    //     int arr[] = {3, 4, 2, 5, 6, 7, 5, 3, 2};

    //     boolean duplicate = false;

    //     for (int x : arr) {

    //         if (hs.contains(x)) {
    //             duplicate = true;
    //             break;
    //         } 
    //         else {
    //             hs.add(x);
    //         }
    //     }

    //     if (duplicate) {
    //         System.out.println("Duplicate exists");
    //     } 
    //     else {
    //         System.out.println("Duplicate does not exist");
    //     }
    // }


    public static void intersection(int[] num1, int[] num2) {
       HashSet<Integer> map=new HashSet<>(); 
        for(int i=0;i<num1.length;i++){
map.add(num1[i]);
        }
      
        for(int j=0;j<num2.length;j++){
            if(map.contains(num2[j]))
            {
               System.out.println(num2[j]);
                map.remove(num2[j]);
            }
        }
       
    }


    public static void main(String[]args){
        int num1[]={7,3,9};
        int num2[]={6,3,9,2,9,4};
intersection( num1, num2);
    }
}
