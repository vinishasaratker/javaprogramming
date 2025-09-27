import java.util.Scanner;

class ifelse
 { public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int pin;
    System.out.println("enter pin");
    pin=obj.nextInt();
    if(pin==1234){
        System.out.println("cash withdraw");
    }
    else{
        System.out.println("invalid pin try again");
{
    pin=obj.nextInt();
    if(pin==1234){
        System.out.println("withdraw");
    }
    else{
        System.out.println("invalid pin try again");
        {
            pin=obj.nextInt();
            if(pin==1234){
                System.out.println("withdraw");
            }
            else{
                System.out.println("card blocked");
            }
        }
    }

}    }
 }
    
}
