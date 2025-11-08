public class homework2 {
    static void dup(int arr[]){
        int temp=arr[0];
for(int i=1;i<arr.length-1;i++){
    boolean dup=false;
for(int j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j]&& arr[i]!=-1){
       arr[j]=-1;
       dup=true;
    }
    if(dup){
        System.out.println(arr[i]);
    }
}
}
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,3,3,3,3,5,5};
        dup(arr);
    }
}
