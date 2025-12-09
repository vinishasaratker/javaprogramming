//  import java.util.Scanner;
// public class sswwitchh {
// public static void main(String[] args)
//  {

//      Scanner obj = new Scanner(System.in);
//         System.out.println("Enter any number :");
//         int option = obj.nextInt(); 
//     // enhance switch case condition--
// String result=switch(option){
//     case 1->"case 1";
//     case 2->" case 2";
//     case 3->"case 3";
//     case 4->" case 4";
//     default->" invalid";
// };// switch ke bad semicolon lgana na bhoole
// System.out.println(result);}   
// } 

// disadvantages of switch -- 1.  break ka use krna hota hai bar bar 
// 2. it support only int char byte long short and strings in a new version
// 3. no fixed position of default
// 4. nesting possible to hai lekin readability kam ho jayengi  or complex code ho jayenga

import java.util.Scanner;
class sswwitchh{
    public static void main(String[]args){
        char option;
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter any option");
       option= obj.next().charAt(0);
       String result;
       switch(option){
case '1': System.out.println("case1");
break;
case '2': System.out.println("case2");
break;
case '3': System.out.println("case3");
break;
case '4': System.out.println("case4");
 break;
 default: System.out.println("invalid");
       };
    }
}