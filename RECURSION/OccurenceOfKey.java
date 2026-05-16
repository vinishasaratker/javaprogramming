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
    public static void main(String[] args) {
         int arr[]={2,4,5,6,7,5,99,9,0};
         System.out.println(firstoccurence(arr, 5, 0));
    }
}
