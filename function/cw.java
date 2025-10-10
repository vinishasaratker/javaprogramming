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
//     }
import java.util.Scanner;
public class cw {  
    char names(char ch) {
        return ch;  }
    public static void main(String[] args) {
        cw obj = new cw();
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        ch = sc.next().charAt(0);
System.out.println("Result: " + obj.names(ch));
    }
}

    
