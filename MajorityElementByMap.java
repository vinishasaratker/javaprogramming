 import java.util.*;
 class MajorityElementByMap{
    public static void main(String[]args){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,2,8,3,1,1,4,1,2};
        for(int i=0;i<arr.length ;i++){
     map.put(arr[i], map.getOrDefault(arr[i], 0) +1);

 }
for(Integer key:map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            } }
    }
 }