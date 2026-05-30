package DivideAndConquere;
// this   problem is for rotated shorted array array rotate or short hona chahiye 
public class Keysearch {
public static int search(int arr[],int si,int tar,int ei){
        if(si>ei)// base case 
        { return -1 ;}
// kaam 
 int mid=si+(ei-si)/2;
 // case found 
 if(arr[mid]==tar){
    return mid ;
 }

 // mid lie of line l1
 if(arr[si]<=arr[mid]){

// case 1 : jab  line l1 ke left pr hai 
    if(arr[si]<=tar && tar<=arr[mid]){
        return search(arr, si, tar, mid-1);
    }
    // case b jab line  l1 ke right pr lie kre 
    else{
        return search(arr, mid+1, tar, ei);
    }
 }

 else{
    // case c  line l2 ka right 
    if( arr[mid]<=tar && tar<=arr[ei]){
        return search(arr, mid+1, tar, ei);
    }
// case d jab line l2 ke left side pr ho 
else{
    return search(arr, si, tar, mid-1);
}
}   }
    public static void main(String[] args) {
        
        int arr[]={4,5,6,7,0,1,2};
       int targetIndex=search(arr, 0, 4, arr.length-1);
   System.out.println(targetIndex);
}
}
