import java.util.Scanner;
public class basicfunction {
static void method1(int array[]){
    
        System.out.println(array[3]);
        System.out.println(array[1]);
        System.out.println(array[0]);
    }
     static void method2(int arr2[]){
        int n = arr2.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr2[i]);
        }
    }
      static void inputInArray(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = obj.nextInt();
        int arr3[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " );
            arr3[i] = obj.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++){
            System.out.println(arr3[i]);
        }
    }
static void sumofarray(int sum[]){
    int n=sum.length;
    int summ=0;
    for(int i=0;i<n;i++){
summ=summ+sum[i];
    }
    System.out.println(" the summetion is "+summ);
}
   public static void main(String[] args) {
        int array[] = {23, 56, 798, 98};
        method1(array);
        int arr2[] = {2, 4, 6, 8, 10, 11};
        method2(arr2);
         inputInArray();
         int sum[]={1,2,3,4,5};
         sumofarray(sum);
    }
}
