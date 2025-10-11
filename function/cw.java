// import java.util.Scanner;
// public class cw {
//     int value(int a){
//         return a;
//     }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int number;
//     System.out.println(" enterv value");
//     number=sc.nextInt();
//     cw obj=new cw();
//      int ans=obj.value(number);
//      System.out.println(ans);}
//     }


// import java.util.Scanner;
// public class cw{
//     void print(int number){

//     }
//     public static void main(String[] args) {
//         int number;
//         Scanner sc=new Scanner(System.in);
//      System.out.println(" enter value");
//    number=sc.nextInt();
//     cw obj=new cw();
//    obj.print(number);
//     }
// }
// import java.util.Scanner;
// public class cw{  
//     String names(){
//         return " welcome to this code";
//  } public static void main(String[] args) {
//         cw obj=new cw();
//         System.out.println(obj.names());
//         }
//     
// import java.util.Scanner;
// public class cw {  
//     static char names(char ch) {
//         return ch;  }
//     public static void main(String[] args) {
//     System.out.println(names('a'));   
//     }
// }
// return type --byte short long boolean  int  double char float  string
// non return-- void

    
// import java.util.Scanner;
// class cw{
//     static void sub(){
//         System.out.println(9-7);
//     }
//     static int add(){
//         System.out.println(4+9);
//         return 0;
//     }
//     static String nam(){
//         System.out.println("i am vinisha");// agr hame returnke sath value print krana hai to sout ke sath b function ko call krna pdenga 
//         return" vini";
//     }
//     static char print(){
//         System.out.println('g');
//         return 0;
//     }
//     static boolean booll(){
//         System.out.println("true");
//         return false;
//     }
//     public static void main(String[] args) {
//        sub();
//       add();
//      System.out.println(nam());
//       print();
//       booll();
//       nam();

//     }
// }

// function with parameters
// import java.util.Scanner;
// class cw{
//    static int division(int a,int b){
//         System.out.println("division is+"  "+  (a/b) );
//         return 0;}
//     public static void main(String[] args) {
//     system.out.println(division(10,5));
//      }
// }
// function overloading   jab ek hi function ko ek hi file me multiple times call krte haito usko function overloading bolte hai
//1. on the basis of parameter
// 2. on the basis or overlapping
// class cw{
//     static int my(int a,int b){
//         System.out.println(a+b);
// return 0;
//     }
//     public static void main(String[] args) {
   
//        System.out.println(my(2,7));  
       
//     }
// }
// recursion functionkhud ko call krta h datatype only returntype hota hai non return nhi hotahai
// or yeh ek loop ki trh kaam krta hai 
// fir loop ko rokne ke liye ek condition use krte hai
import java.util.Scanner;
class cw{
  static int summ(int n){
if(n==0) return 0;
    return summ(n-1)+n;
  }
  public static void main(String[] args) {
   
       System.out.println(summ(10));    }
}