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
// import java.util.Scanner;
// class testque{
//     public static void main(String[] args) {
//         int d;
//         int x;
//         Scanner obj=new Scanner(System.in);
//         System.out.println(" enter any value for x");
//         x=obj.nextInt();
//         d=3*x^2-4*x+1;
//         if(d>0){
//             System.out.println("real or distrint root");
//         }
//         else if(d<0){
//             System.out.println("imaginary roots");
//         }
//         else if(d==0){
//             System.out.println("real or equal roots");
//         }
//         else{
//             System.out.println("invalid  roots");
//         }
//     }
// }
// import java .util.Scanner;
// class testque{
//     public static void main(String[] args) {
        
//        // Voting Eligibility with Citizenship
//         //Ask age and nationality from user.If age ≥ 18 and nationality is “Indian” → 
//        // Eligible to vote, else not eligible.
//        Scanner obj=new Scanner(System.in);

//        int age;
//        System.out.println(" enter age of voter");
//        age= obj.nextInt();
//        String nationalitiy;
// System.out.println(" enter nationality");
// nationalitiy=obj.next();
// if(age>=18 && nationalitiy.equals("indian")){
//     System.out.println("eligible for vote");
// }
// else {
//     System.out.println(" not eligible");
// }

// //     }
// // }
// import java.util. Scanner;
// class testque{
//  public static void main(String[] args){
// Scanner my=new Scanner(System.in);
// int price=200;
// String customer;
// System.out.println(" enter customer  id student or aged");
// customer= my.next();
// if(customer.equals("student")){
//     System.out.println(" you got  50 % discount+"+price*50/100);
// }
// else if(customer.equals("seniorcitizen")){
//     System.out.println(" you got 30 % discount +"+" "+ price*30/100);
// }
// else{
//     System.out.println(" full price "+ " "+ price);
// }

//  }
// }
// import java.util.Scanner;
// class testque{
//     public static void main(String[]args){
//         Scanner water=new Scanner(System.in);
//         int hour;
//         System.out.println(" enter hour of parking your vehicals");
//         hour= water.nextInt();
// int price=20;
//         if(hour==2){
//             System.out.println(" there is  20 rupees of charge +" +" "+ price);
//         }
//         else if(hour>2){
//             System.out.println(" extra charges +"+" "+ (hour-2)*10);
//         }
//     }
// }
import java.util.Scanner;
class testque{
    public static void main(String[]args){
        Scanner sec=new Scanner(System.in);
        int seconds;
        System.out.println(" enter number of seconds");
        seconds=sec.nextInt();
        int hours;
        hours=seconds/3600;
        int remainingsecond=seconds%3600;
        int minute;
        minute=remainingsecond/60;
        int seco;
        seco=remainingsecond%60;
        System.out.println(" total time is +" +" "+ hours  + " "+ minute+" "+ seco);
    }
}