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

    
import java.util.Scanner;
class cw{
    static void sub(){
        System.out.println(9-7);
    }
    static int add(){
        System.out.println(4+9);
        return 0;
    }
    static String nam(){
        System.out.println("i am vinisha");// agr hame returnke sath value print krana hai to sout ke sath b function ko call krna pdenga 
        return" vini";
    }
    static char print(){
        System.out.println('g');
        return 0;
    }
    static boolean booll(){
        System.out.println("true");
        return false;
    }
    public static void main(String[] args) {
       sub();
      add();
     System.out.println(nam());
      print();
      booll();
      nam();

    }
}
