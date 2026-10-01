
import java.util.*;
class BasicRecursion {

    // recursion me ek base case jrur hona chahiye nhi to stack overflow ki
    // condition aa jati hai
    public static void printdecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printdecreasing(n - 1);

    }

    public static void printincrasing(int m) {

        if (m == 1) {
            System.out.print(1 + " ");
            return;
        }

        printincrasing(m - 1);
        System.out.print(m + " ");
    }

     
 static void printnumbers(int num)
{
    if(num==1){
        System.out.print(num);
        return ;
    }
    printnumbers(num-1);
    System.out.println(num);
}



static int fact(int num1) {

    if (num1 == 1) {
        return 1;
    }

    return num1 * fact(num1 - 1);
}



    
    public static void main(String[] args) {

        int n = 10;
        // printdecreasing(n);

        int m = 40;
        // printincrasing(m);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number:");
        // int num = sc.nextInt();

        // printnumbers(num);

        int num1 = 5;

        System.out.println(fact(num1));
    }
}