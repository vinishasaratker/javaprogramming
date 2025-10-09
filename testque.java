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
import java.util.Scanner;
class testque{
    public static void main(String[] args) {
        
        Scanner tq=new Scanner(System.in);
        int num;
        System.out.println(" enter any three digit number");
        num=tq.nextInt();
        if(num>=100 &&num<=999){
int digit3;
digit3=num%10;
num=num/10;
int digit2;
digit2=num%10;
num=num/10;
int digit1;
digit1=num%10;
num=num/10;
if(digit1>digit2 && digit1>digit3){
    System.out.println(" digit 1 is greater+"+digit1 );

}
else if(digit2>digit1 && digit2>digit3){
    System.out.println(" digit 2 is greater +"+ digit2);
}
else if(digit3>digit1 && digit3>digit2){
    System.out.println(" digit 3 is greater + "+ digit3);
}
else if(digit1==digit2 && digit2==digit3 ){
    System.out.println(" all digits are same");

}

        }
        else{
            System.out.println(" invalid");
        }

    }
}
