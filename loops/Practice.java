
 import java.util.Scanner;
public class Practice

{
    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       System.out.println("enter two number ");
//       int n1=sc.nextInt();
//       int n2=sc.nextInt();

//       if(n1==n2){
//         System.out.println("both are equal");
//       }
//  else if(n1>n2){
//     System.out.println("n1 is greater " +n1);
// }
// else{
//     System.out.println("n2 is greater "+ n2);
// }

// System.out.println("swappinbg");

int a=10;int b=3;
int temp ;
// temp=b ;
// b=a;
// a=temp ;
// System.out.println(" a -is :"+a);
// System.out.println(" b is-"+b);

// System.out.println(" without using third variable swapping ");
// a=a+b;
// b=a-b ;
// a=a-b ;
// System.out.println(" value  of a is "+ a);
// System.out.println("value of b is :"+ b);

// System.out.println("sum of n odd numbers ");
// int n=30 ;
// int sum=0 ;
// for(int i=1;i<n ;i++){
// if(i%2!=0){
// sum=sum+i;
// }

// }

// System.out.println("sum is s"+ sum);


// int digit =1234 ;
// int count =0;
// int ssum =0 ;

// while(digit>0){
//      int ldigit =digit%10 ;
//      if(ldigit%2==0){
//         ssum=ssum+ldigit;
//      }

// digit=digit/10;
// }
// System.out.println(ssum+"<=ssum is ");


// System.out.println("reverse of a number");
// int number=55244;
// while(number>0){
// int lastdigit=number%10 ;
// System.out.print(lastdigit);
// number=number/10;


System.out.println(" armstrong number ");
int m=183 ;
int tempr=m ;
int store=0;

while(m>0){
    int lastno=m%10 ;
    int ans=lastno*lastno*lastno;
 store=store +ans ;
    m=m/10 ;
   
}

if(tempr==store){
    System.out.println("armstrong ");
}
else{
    System.out.println(" not armstrong ");
}

}
    }

