import java.util.Scanner;

class TransactionMonitoring {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number of transactions:");
        // int n = sc.nextInt();

        // String[] sender = new String[n];
        // String[] receiver = new String[n];
        // int[] time = new int[n];
        // int[] amount = new int[n];

        // for (int i = 0; i < n; i++) {

        //     System.out.println("Enter sender:");
        //     sender[i] = sc.next();

        //     System.out.println("Enter receiver:");
        //     receiver[i] = sc.next();

        //     System.out.println("Enter timestamp:");
        //     time[i] = sc.nextInt();

        //     System.out.println("Enter amount:");
        //     amount[i] = sc.nextInt();

        //     // Check with previous transactions
        //     for (int j = 0; j < i; j++) {

        //         // Rule 1: Same sender and receiver
        //         if (sender[i].equals(sender[j]) &&
        //             receiver[i].equals(receiver[j])) {

        //             System.out.println("ERROR DUPLICATION TRANSACTION");
        //             return;
        //         }
        //     }

        //     // Rule 2: Time difference with consecutive transaction
        //     if (i > 0 && time[i] - time[i - 1] > 60) {

        //         System.out.println("FRAUD DETECTED");
        //         return;
        //     }
        // }

        // // Rule 3
        // System.out.println("ALL TRANSACTION ARE VALID");



Scanner nn=new Scanner(System.in);
System.out.println("enter amount");
 int amount=nn.nextInt();
 if(amount<1000){
    System.out.println("your discount is 5 %");
double discount=amount*5/100;
System.out.println( amount-discount);

 }
  else if( amount<=1000 && amount<5000){
    System.out.println("your discount is 10 %");
double discount=amount*10/100;
System.out.println( amount-discount);

 }
    }
}