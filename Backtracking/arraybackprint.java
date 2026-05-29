package Backtracking;

public class arraybackprint {
   
   
    public static void backktrack(int arr[],int i,int val){
     if(i==arr.length){
        System.out.println(arr);
        return ;
     }
     
     
        /// recursion work 
       arr[i]=val;
        backktrack(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
    for( int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[]= new int[5];
        backktrack(arr, 0, 0);
        printarr(arr);
    }
}
