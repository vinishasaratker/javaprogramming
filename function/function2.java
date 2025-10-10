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
// import java .util.Scanner;
// public class function2{
//       int ans=1;
//     int fact(int num){
//         for(int i=1;i<=num;i++){
//           ans=ans*i; }
//         return ans;}
//     public static void main(String[] args) {
//         Scanner  sc=new Scanner(System.in);
//         int number;
//         System.out.println(" enter number");
//         number=  sc.nextInt();
//         function2 obj=new function2();
//          int anss=obj.fact(number);
//          System.out.println(anss);}
// }
// import java.util.Scanner;
// class function2{
//     int prime(int num){
//         int count=0;
//         for(int i=1;i<=num;i++){
//             if(num%i==0){
// count++; }}
//          if(count>2){
//                 System.out.println(" not prime");}
//             else{
//                 System.out.println(" prime");}   
//                 return 0;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int number;
//         System.out.println(" enter any number");
//         number=sc.nextInt();
//         function2 obj=new function2();
//         obj.prime(number);
//     }
// }
import java.util.Scanner;
class function2{
int largest(int num1,int num2,int num3){
    if(num1>num2 && num1>num3){
        System.out.println(" num1 is greater +"+" "+num1);
    }
    else if(num2>num3 && num2>num1){
        System.out.println(" num 2 is greater +"+" "+num2);
    }
    else{
        System.out.println(" num3 is greater +"+" "+num3);
    }
    return 0;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println(" enter first number");
        a=sc.nextInt();
        int b;
         System.out.println(" enter second number");
        b=sc.nextInt();
        int c;
         System.out.println(" enter third number");
        c=sc.nextInt();
function2 obj=new function2();
obj.largest(a,b,c);

    }
}