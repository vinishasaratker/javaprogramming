
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

//function with parameters-- mtlb function  ke andr data types ko de do
// import java.util.Scanner;
// class cw{
//   static int division(int a,int b){
//     System.out.println(a/b);
//     return 0;
//   }
//   public static void main(String[] args) {
//     System.out.println( division(50,10));
    
//   }
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
// // }
// // recursion  jab function khud ko call krta h datatype only return type hota hai non return nhi hota hai
// // or yeh ek loop ki trh kaam krta hai 
// // fir loop ko rokne ke liye ek condition use krte hai
// import java.util.Scanner;
// class cw{
//   static int summ(int n){
// if(n==0) {return 0;}
//     return summ(n-1)+n;
//   }
//   public static void main(String[] args) {
   
//        System.out.println(summ(10));    }
// }
// // 10+summ(9)
// //      9+sum(8)    
//                 //8+ summ(7) 
//                         // 7+ summ(6)
//                                  // 6+summ(5)
//                                        //5+ summ(4) 

//                      // 4+ summ(3)
//                                  // 3+summ(2)
//                                          //2+ summ(1) 
//                                                // 1+ summ(0)
import java.util.Scanner;
class cw{
  static int summ(int n){
if(n==0) {return 1;}
    return summ(n-1)*n;
  }
  public static void main(String[] args) {
   
       System.out.println(summ(10));    }
  }