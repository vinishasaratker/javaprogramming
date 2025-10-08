import java.util .Scanner;
public class hospitalque {
  public static void main(String[] args) {
     Scanner obj=new Scanner (System.in);
     String patient;
     System.out.println("enter patient condition  ");
     patient=obj.next();
     int bil;

     //********** */


     if(patient.equals("CVR")){
       System.out.println("your patient is serious :");
       String ward;
     System.out.println("enter ward number according to patient condition :");
     ward=obj.next();
     int option;
     System.out.println("enter 1 for billing and 2for shifting in normal ward :");
     option=obj.nextInt();

if(option==1){
  if(ward.equals("emergency")){
   int days;
        System.out.println("enter days in hospital");
     days=obj.nextInt();
        bil=days*3000;
        System.out.println(" your bill is +"+" "+bil);
        } 
}

     else if(option==2){
      System.out.println("shifting in another ward according to doctor ");

     }
      
      }

        //******************* */


     else if(patient.equals("mediator")) {
System.out.println(" your patient is in  critical  condition");
String ward;
     System.out.println("enter ward number according to patient condition");
     ward=obj.next();
if(ward.equals("private")){
 int option;
     System.out.println("enter 1 for billing and 2for shifting in normal ward");
     option=obj.nextInt();
if(option==1){  
  int days;
   System.out.println("enter days in hospital");
     days=obj.nextInt();
     bil=days*2000;
     System.err.println(" your bill is +"+""+bil );}
     else if(option==2){
      System.out.println("shift in another ward");
     }

} }
///******************************** */



     else if(patient.equals("normal")){
      System.out.println(" your patient is good");
       String ward;
     System.out.println("enter ward number according to patient condition");
     ward=obj.next();

      if(ward.equals("general")){

        int option;
     System.out.println("enter 1 for billing and 2for shifting in normal ward");
     option=obj.nextInt();
if(option==1){
        int days;
        System.out.println("enter days in hospital");
        days=obj.nextInt();
        bil=days*1000;
        System.out.println(" your bill is +"+" "+bil);}
      }  }


     else{
      System.out.println("invalid");
     }
  }  
}
