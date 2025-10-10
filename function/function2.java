// import java.util.Scanner;

// public class function2 {
//     void printname(String name) {
//         System.out.println(name);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.next();
//  function2 obj = new function2();  // Create object of class
//         obj.printname(name);              // Call the method correctly
//     }
// }

// import java.util.Scanner;
// public class function2{
//     int sum(int a,int b){
//         int add;
//         add=a+b;
//         return add;
//     }
//     public static void main(String[] args) {
        
// Scanner sc=new Scanner(System.in);
// System.out.println(" enter first value");
// int a= sc.nextInt();
// int b;
// System.out.println(" enter second number");
// b=sc.nextInt();
// function2 obj=new function2();
// int result= obj.sum(a,b);
// System.out.println(" sum is +" +" "+result);
//     }
// }

// import java.util.Scanner;
// public  class function2{
//     int multiplication(int a,int b){
//         int mul=a*b;
//         return mul;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc= new Scanner(System.in);
//         int num1;
//         System.out.println(" enter number first");
//         num1= sc.nextInt();
//         int num2;
//         System.out.println(" enter second number");
//         num2=sc.nextInt();
//         function2 obj=new function2();
//         int multi=obj.multiplication(num1,num2);
//         System.out.println(" multiplication is +"+"" + multi);


        
//     }
    
// }
// import java .util.Scanner;
//  public class function2{
//     int powerr(int a,int b){
//         int ans=1;
//         for(int i=1;i<=b;i++){
//             ans=ans*a; }
//      return ans;}
//     public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   int a;
//   System.out.println(" enter  base value"); 
//   a= sc.nextInt(); 
//   int b;
//   System.out.println(" enter power");
//   b= sc.nextInt();  
//   function2 obj=new function2();  
//   int powwer= obj.powerr(a,b);
//   System.out.println(" power is +"+" "+powwer); }
// }
// import java.util.Scanner;
// public class function2{
//     int even(int number){
//         if(number%2==0){
//             System.out.println("even");}
//         else{
//             System.out.println("odd");}
//         return 0;}
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int number;
//     System.out.println(" enter any number");
//     number= sc.nextInt();
//     function2 obj=new function2();
//     obj.even(number);
// }
// }
import java .util.Scanner;
public class function2{
      int ans=1;
    int fact(int num){
        for(int i=1;i<=num;i++){
          ans=ans*i; }
        return ans;
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int number;
        System.out.println(" enter number");
        number=  sc.nextInt();
        function2 obj=new function2();
         int anss=obj.fact(number);
         System.out.println(anss);
     

    }
}
