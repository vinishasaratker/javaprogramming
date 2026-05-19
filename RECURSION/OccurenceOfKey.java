public class OccurenceOfKey {
    public static int firstoccurence(int arr[],int key,int i){

        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
public static int tilingproblrm(int n){
if(n==1 || n==0){
    return 1 ;
}

    int fm1=tilingproblrm(n-1);
    int fm2=tilingproblrm(n-2);
    int total=fm1+fm2;
    return total ;
}
  public static void main(String[] args) {
         int arr[]={2,4,5,6,7,5,99,9,0};
         System.out.println(firstoccurence(arr, 5, 0));


System.out.println(tilingproblrm(4));
    }
}
