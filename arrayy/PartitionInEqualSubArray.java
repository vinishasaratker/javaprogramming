class PartitionInEqualSubArray{
static int FindSum(int arr[]){

int totalsum=0;

for(int i=0 ;i<arr.length;i++){

    totalsum=totalsum+arr[i];

}
return totalsum ;

}
static boolean partition(int arr[]){

int sum=FindSum(arr);

int prefixsum=0;

for(int i=0;i<arr.length;i++){

    prefixsum +=arr[i];
    int suffixsum=sum-prefixsum;
    if(prefixsum==suffixsum){
        return false ;

    }

}

return true ;

}
public static void main(String[] args){

    int arr[]=  {10,5,6,4,2,3}  ;

    System.out.println(" sum is :"+partition(arr));
}

}