package Sorting;
public class Selectionsort {
public static void ss(int arry[]){
      int n=arry.length;
      for(int i=0;i<n;i++){
        int minposition=i;
        for(int j=i+1;j<n;j++){
            if(arry[minposition]>arry[j])
          minposition=j;
            }
            int temp=arry[minposition];
            arry[minposition]=arry[i];
            arry[i]=temp;
    }  
}
 public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arry[]={2,4,5,6,78,1,1};
        ss(arry);
         printarr(arry);
    }
    
}
