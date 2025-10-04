
import java .util.Scanner;
public class elseif {
 public static void main(String[] args) {
    
     Scanner obj=new Scanner(System.in);

     int month;
     System.out.println("enter any month number");
     month= obj.nextInt();
     if(month==4 || month==9 || month==6 || month==11){
        System.out.println("there are 30days in month");
     }
     else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==12){
        System.out.println(" 31 days in there month");
     }
     else if(month==2){
        System.out.println("28/29 days in this monrh");
     }
     else{
        System.out.println("invalid");
     }
 }
    

}
