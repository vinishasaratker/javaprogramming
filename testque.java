// import java .util.Scanner;
// class testque{
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         // write a program to create a calculator
//         int num1;
// System.out.println("enter first number");
// num1= obj.nextInt();
// int num2;
// System.out.println(" enter second number :");
// num2=obj.nextInt();
// char ch;
// System.out.println(" enter any  operator which operation you want to perform +,-,*,/");
// ch= obj.next().charAt(0);
// if(ch=='+'){
//     System.out.println(" your additon is +"+(num1+num2));
// }
// else if(ch=='-'){
//     System.out.println(" subtraction is +"+(num1-num2));
// }
// else if(ch=='*'){
//     System.out.println(" your multiplication is +"+(num1*num2));
// }
// else if(ch=='/'){
//     System.out.println(" your division is +"+(num1/num2));
// }
// else{
//     System.out.println(" invalid");
// }
//     }
// }
// import java.util.Scanner;
// class testque{
//     public static void main(String[] args) {
    //    // largest digit of a three digit numberquestion
//         Scanner tq=new Scanner(System.in);
//         int num;
//         System.out.println(" enter any three digit number");
//         num=tq.nextInt();
//         if(num>=100 &&num<=999){
// int digit3;
// digit3=num%10;
// num=num/10;
// int digit2;
// digit2=num%10;
// num=num/10;
// int digit1;
// digit1=num%10;
// num=num/10;
// if(digit1>digit2 && digit1>digit3){
//     System.out.println(" digit 1 is greater+"+digit1 );

// }
// else if(digit2>digit1 && digit2>digit3){
//     System.out.println(" digit 2 is greater +"+ digit2);
// }
// else if(digit3>digit1 && digit3>digit2){
//     System.out.println(" digit 3 is greater + "+ digit3);
// }
// else if(digit1==digit2 && digit2==digit3 ){
//     System.out.println(" all digits are same");

// }

//         }
//         else{
//             System.out.println(" invalid");
//         }

//     }
// }
// import java.util.Scanner;
//  class testque{
//     public static void main(String[] args) {
//         Scanner obj=new Scanner(System.in);
//         // write a program to create a triangle checker
//         int side1;
//         System.out.println("enter  first side of triangle ");
//         side1= obj.nextInt();
//         int side2;
//         System.out.println(" enter second side of a triangle ");
//         side2=obj.nextInt();
//         int side3;
//         System.out.println(" enter third side of a triangle");
//         side3=obj.nextInt();
//         if(side1==0 && side2==0 && side3==0){
//             System.out.println(" invalid triangle");
//         }
//         else if(((side1+side2)>side3) || ((side2+side3)>side1) || ((side3+side2)>side1)){
//             if( side1==side2 && side2==side3){
//                 System.out.println("equilateral triangle");}
//                 else if(side1==side2 && side2!=side3){
//                     System.out.println("isosceles triangle");
//                 }
//                 else if(side1!=side2 && side2!=side3 && side3!=side1){
//                     System.out.println("scalene triangle");
//                 }
//         }
//         else{
//             System.out.println(" invalid");
//         }
//     }
//  }
import java.util.Scanner;
class testque{
    public static void main(String[] args) {
        int d;
        int x;
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter any value for x");
        x=obj.nextInt();
        d=3*x^2-4*x+1;
        if(d>0){
            System.out.println("real or distrint root");
        }
        else if(d<0){
            System.out.println("imaginary roots");
        }
        else if(d==0){
            System.out.println("real or equal roots");
        }
        else{
            System.out.println("invalid  roots");
        }
    }
}