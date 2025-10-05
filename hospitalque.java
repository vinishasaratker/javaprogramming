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
       System.out.println("your patient is serious");
       String ward;
     System.out.println("enter ward number according to patient condition");
     ward=obj.next();
      if(ward.equals("emergency")){
   int days;
        System.out.println("enter days in hospital");
     days=obj.nextInt();
        bil=days*3000;
        System.out.println(" your bill is +"+" "+bil);
        } }

        //******************* */


     else if(patient.equals("mediator")) {
System.out.println(" your patient is in  critical  condition");
String ward;
     System.out.println("enter ward number according to patient condition");
     ward=obj.next();
if(ward.equals("private")){
  int days;
   System.out.println("enter days in hospital");
     days=obj.nextInt();
     bil=days*2000;
     System.err.println(" your bill is +"+""+bil );

} }
///******************************** */



     else if(patient.equals("normal")){
      System.out.println(" your patient is good");
       String ward;
     System.out.println("enter ward number according to patient condition");
     ward=obj.next();

      if(ward.equals("general")){
        int days;
        System.out.println("enter days in hospital");
        days=obj.nextInt();
        bil=days*1000;
        System.out.println(" your bill is +"+" "+bil);
      }  }


     else{
      System.out.println("invalid");
     }
  }  
}
