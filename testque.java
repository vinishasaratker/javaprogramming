import java .util.Scanner;
class testque{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        // write a program to create a calculator
        int num1;
System.out.println("enter first number");
num1= obj.nextInt();
int num2;
System.out.println(" enter second number :");
num2=obj.nextInt();
char ch;
System.out.println(" enter any  operator which operation you want to perform +,-,*,/");
ch= obj.next().charAt(0);
if(ch=='+'){
    System.out.println(" your additon is +"+(num1+num2));
}
else if(ch=='-'){
    System.out.println(" subtraction is +"+(num1-num2));
}
else if(ch=='*'){
    System.out.println(" your multiplication is +"+(num1*num2));
}
else if(ch=='/'){
    System.out.println(" your division is +"+(num1/num2));
}
else{
    System.out.println(" invalid");
}
    }
}
