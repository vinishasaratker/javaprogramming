// import java.util.Scanner;

// class ifelse
//  { public static void main(String[] args) {
//     Scanner obj=new Scanner(System.in);
//     int pin;
//     System.out.println("enter pin");
//     pin=obj.nextInt();
//     if(pin==1234){
//         System.out.println("cash withdraw");
//     }
//     else{
//         System.out.println("invalid pin try again");
// {
//     pin=obj.nextInt();
//     if(pin==1234){
//         System.out.println("withdraw");
//     }
//     else{
//         System.out.println("invalid pin try again");
//         {
//             pin=obj.nextInt();
//             if(pin==1234){
//                 System.out.println("withdraw");
//             }
//             else{
//                 System.out.println("card blocked");
//             }
//         }
//     }

// }    }
//  }
    
// }
// import java.util.Scanner;
// class ifelse
// {
//     public static void main(String[] args) {
//      Scanner obj=new Scanner (System.in);
//         int a;
//     System.out.println("enter number 1st");
//     a =obj.nextInt();

//     int b;
//     System.out.println("enter second number");
//     b=obj.nextInt();
//     int c;
//     System.out.println("enter third number");
//     c=obj.nextInt();
//     if((a*a)+(b*b)==(c*c)){
// System.out.println("pythagorous");
//     }
//     else{
//         System.out.println(" not pythagorous" );
//     }
//     }
// }
// import java.util. Scanner;
// class ifelse
// {
//     public static void main(String[] args) {
        
//       Scanner obj=new Scanner(System.in);  
//       int day;
//       System.out.println(" enter any day");
//       day=obj.nextInt();
//       if(day==1){
//         System.out.println("monday");
//       }
//       else if(day==2){
//         System.out.println("tuesday");
//       }

//       else if(day==3){
//         System.out.println("wednesday");
//       }
//       else if(day==4){
//         System.out.println("thursday");
//       }
//             else if(day==5){
//         System.out.println("friday");
//       }
//       else if(day==6){
//         System.out.println("saturday");
//       }
//             else if(day==7){
//         System.out.println("sunday");
//       }
      


//     }
// }

// class ifelse{
//     public static void main(String[] args) {
//       int z=5;
//       int p=9;
//       int temp;
//       temp=z;
//       z=p;
//      p=temp;
//       System.out.println(z);  
//       System.out.println(p);
//     }
// }
// class ifelse{
//   public static void main(String[] args) {
    
//     int s=6;
//     int t=9;
//     s=s+t;
//     t=s-t;
//     s=s-t;
//     System.out.println(s);
//     System.out.println(t);

//   }
// }
// import java.util.Scanner;
//  public class ifelse {
 
//   public static void main(String[] args) {
//     Scanner obj=new Scanner(System.in);
//     int num;
//     System.out.println("enter any number");
//     num=obj.nextInt();
//     // programof alwaysprint positive number
//     if(num<0){
//       System.out.println(num*(-1));
//     }
//     else{
//       System.out.println(num);
//     }


//   }
//  }
import java.util.Scanner;
public class ifelse {

  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int year;
    System.out.println("enter any year");
    year=obj.nextInt();
    if((year%4==0 && year%400==0)||year%100!=0){
      System.out.println("leap year");
    }
    else{
      System.out.println("not leap year");
    }

  }
}