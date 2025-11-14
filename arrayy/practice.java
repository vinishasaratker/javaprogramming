public class practice
 {  static void largest(int arr1[]){
        // find the largest element in an array
        int n=arr1.length;
        int big=arr1[0];
        for(int i=0;i<n;i++){
if(arr1[i]>big){
   big=arr1[i];  
}
        }System.out.println( "maximum number is "+big);
       
        }
        static void reverse(int arr2[]){
            // reverse of an array 
            int start=0;
            int n=arr2.length;
              int end=n-1;
          while( start<=end){
                int temp=arr2[start];
                arr2[start]=arr2[end];
                arr2[end]=temp; 
            start++;
        end--; }
        for(int i=0;i<n;i++){
            System.out.println( "reverse array is "+arr2[i]);
        }}
        static void sum(int arr3[]){
            int sum=0;
            int  n=arr3.length;
            for(int i=0;i<n;i++){
               sum=sum+arr3[i]; 
            }
            System.out.println("sum is "+ sum);
        }
        
        

    public static void main(String[] args) {
        int arr1[]={1,2,3,56,98};
        largest(arr1);
        int arr2[]={5,8,9,6,5};
        reverse(arr2);
        int arr3[]={1,2,4,5,3};
        sum(arr3);
    }
    
}
