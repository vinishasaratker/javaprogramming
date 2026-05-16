public class Fctorial {
    public static int factorial(int n) {
        int fact = 1;
        if (n == 1) {
            return 1;
        }

        int ans = fact * n * factorial(n - 1);
        return ans;

    }

    public static int sumOfnNaturalNo(int m) {

        if (m == 1) {
            return 1;
        }
        int ans = m;
        ans = ans + sumOfnNaturalNo(m - 1);
        return ans;

    }

    public static int printNthFebonachhi(int f){
        if(f==0){
            return 0;
        }
        if(f==1){
            return 1;
        }
        int ans=printNthFebonachhi(f-1)+printNthFebonachhi(f-2);
        return ans ;
    }

    public static boolean isShorted(int arr[],int i){
int n=arr.length;
        if(i==n-1){
            return true ;
        }
        if(arr[i]<arr[i+1]){
            return false ;
        }
        return isShorted(arr,i+1);
    }

    
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
        int m = 5;
        System.out.println(sumOfnNaturalNo(m));
        int f=5;
        System.out.println(printNthFebonachhi(f));
        int arr[]={1,2,3,4};
        int i=0;
       System.out.println(isShorted(arr,i));
    }
}
