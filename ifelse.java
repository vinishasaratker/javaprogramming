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
import java.util.Scanner;
class ifelse
{
    public static void main(String[] args) {
     Scanner obj=new Scanner (System.in);
        int a;
    System.out.println("enter number 1st");
    a =obj.nextInt();

    int b;
    System.out.println("enter second number");
    b=obj.nextInt();
    int c;
    System.out.println("enter third number");
    c=obj.nextInt();
    if((a*a)+(b*b)==(c*c)){
System.out.println("pythagorous");
    }
    else{
        System.out.println(" not pythagorous" );
    }
    }
}
