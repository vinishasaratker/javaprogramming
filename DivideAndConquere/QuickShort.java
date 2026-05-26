package DivideAndConquere;

public class QuickShort {
    
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void quickshort(int arr[],int si,int ei){
if(si>=ei){
    return ;
}

    // last element 
//partition pivod ka right index la kr deta hai 
 int pidx=partition(arr,si,ei);
 // left part
 quickshort(arr, si, pidx-1);
 // right part 
 quickshort(arr, pidx+1, ei);

}

 public static int partition(int arr[],int si, int ei){

    int pivot=arr[ei];
    // i jagah bnayenga pivot se smaller  elemnts ke liye
    int i=si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            // swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp ;
        }
    }


   i++;
            // swap
            int temp=pivot;
            arr[ei]=arr[i];
            arr[i]=temp ; 
            return i;
}

    public static void main(String[] args) {
      int arr[]={6,3,8,2,5}; 
      quickshort(arr, 0, arr.length-1); 
      printArr(arr);
    }
}
