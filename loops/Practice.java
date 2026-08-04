
import java.util.Scanner;

public class Practice {

    public static void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
            }
            j++;

            nums[j] = nums[i];

            for (j = 0; j < nums.length; j++) {
                System.out.println(nums[j]);
            }

        }

    }

    public static void main(String[] args) {

        int nums[] = { 3, 4, 0, 5, 0, 9, 0,6,7 };

        moveZeros(nums);

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter two number ");
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();

        // if(n1==n2){
        // System.out.println("both are equal");
        // }
        // else if(n1>n2){
        // System.out.println("n1 is greater " +n1);
        // }
        // else{
        // System.out.println("n2 is greater "+ n2);
        // }

        // System.out.println("swappinbg");

        int a = 10;
        int b = 3;
        int temp;
        // temp=b ;
        // b=a;
        // a=temp ;
        // System.out.println(" a -is :"+a);
        // System.out.println(" b is-"+b);

        // System.out.println(" without using third variable swapping ");
        // a=a+b;
        // b=a-b ;
        // a=a-b ;
        // System.out.println(" value of a is "+ a);
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
        // int ldigit =digit%10 ;
        // if(ldigit%2==0){
        // ssum=ssum+ldigit;
        // }

        // digit=digit/10;
        // }
        // System.out.println(ssum+"<=ssum is ");

        // System.out.println("reverse of a number");
        // int number=55244;
        // while(number>0){
        // int lastdigit=number%10 ;
        // System.out.print(lastdigit);
        // number=number/10;

        // System.out.println(" armstrong number ");
        // int m=183 ;
        // int tempr=m ;
        // int store=0;

        // while(m>0){
        // int lastno=m%10 ;
        // int ans=lastno*lastno*lastno;
        // store=store +ans ;
        // m=m/10 ;

        // }

        // if(tempr==store){
        // System.out.println("armstrong ");
        // }
        // else{
        // System.out.println(" not armstrong ");
        // }

        // System.out.println("febonachhi");

        // int fi=0;
        // int si=1 ;
        // int third;
        // int n=10 ;
        // System.out.print(fi+" "+si);
        // for(int i=0;i<n ;i++){
        // third=fi+si ;
        // fi=si ;
        // si=third ;

        // System.out.print(" "+third);
        // }

        System.out.println("check prime number or not ");
        int p=67 ;
        int c=0;
        for(int i=0 ;i<p;i++){

        if(p%i==0){

        c++;

        }

        }
        if(c>2){

        System.out.println("not a prime number ");

        }
        else{
            
        System.out.println(" prime number ");
        }

    }
}
