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



static void  unionIntersection(int num1[],int num2[]){
HashSet<Integer>map=new HashSet<>();

for(int i=0;i<num1.length;i++){
    map.add(num1[i]);
}
for(int j=0;j<num2.length;j++){
    map.add(num2[j]);
}
System.out.println("Union is :"+map.size());
for(int key:map){
    System.out.println(" " +key);
}
map.clear();

for(int i=0 ;i<num1.length ;i++){
    map.add(num1[i]);
}
int count=0;
for(int j=0 ;j<num2.length ;j++){

    if(map.contains(num2[j])){
count ++ ;
map.remove(num2[j]);
    }
    
}

System.out.println("  intersection is : " + count);

}


public static void main(String[]args){
 int[] arr = {1, 2, 2, 3, 3, 4};
 countunique(arr);
 int arr2[]={1,1,2,3,5,4,5,6,7,8};
 firstnonRepeating(arr2);

 int num1[]={7,3,9};
 int num2[]={6,3,9,2,9,4};
 unionIntersection(num1,num2);
}

}