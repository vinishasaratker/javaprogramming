import java.util.*;
import java.util.Scanner ;
class Rotation {

    static void rotation(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("not rotated");
            return;
        }

        String temp = s1.concat(s1);

        if (temp.contains(s2)) {
            System.out.println("it is rotated");
        }
         else 
        {
            System.out.println("not rotated");
        }
       }

        public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        rotation(s1, s2);
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter string ");
         String para=sc.nextLine();
         if(para.contains("java")){
           para=para.replace("java","python");
         }
         System.out.println(para);

         Scanner pass=new Scanner(System.in);
         System.out.println("enter a password ");\
         pass.nextLine();
         if(pass.length()<8){
            System.out.println(" not a valid password ");
            
         }
         else if(pass.isUpperCase() && pass.isLowerCase() && pass.isDigit() && ){
System.out.println(" password is correct ");
         }


    }
}