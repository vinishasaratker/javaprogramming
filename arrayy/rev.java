public class rev {
    static void reverse(int arr4[]){
        int n=arr4.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=arr4[start];
            arr4[start]=arr4[end];
            arr4[end]=temp;
            start++;
            end--;
        }
       
        for(int i=0;i<n;i++){
            System.out.println(" reverse number is "+arr4[i]);
        }

    }
    public static void main(String[] args) {
        int arr4[]={1,2,3,4,5};
        reverse(arr4);
    }
}
