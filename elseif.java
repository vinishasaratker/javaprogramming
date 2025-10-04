
// import java .util.Scanner;
// public class elseif {
//  public static void main(String[] args) {
    
//      Scanner obj=new Scanner(System.in);

//      int month;
//      System.out.println("enter any month number");
//      month= obj.nextInt();
//      if(month==4 || month==9 || month==6 || month==11){
//         System.out.println("there are 30days in month");
//      }
//      else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==12){
//         System.out.println(" 31 days in there month");
//      }
//      else if(month==2){
//         System.out.println("28/29 days in this monrh");
//      }
//      else{
//         System.out.println("invalid");
//      }
//  }
    

// }


// import java.util.Scanner;
//  public  class elseif{
//     public static void main(String[] args) {
        
//     Scanner obj=new Scanner(System.in);
//     int option;
//     System.out.println("enter option 1. for f-c & 2. for c-f");
//     option= obj .nextInt();

//     if(option==1){
//         int temp;
//         System.out.println("enter tempreture in  fehrenite");
//         temp=obj.nextInt();
//         int ans;
//         ans=(temp-32)*5/9;
//         System.out.println(ans+" "+"tempreture in celsius");


//     }
//     else if(option==2){
//          int temp;
//         System.out.println("enter tempreture in  celsius");
//         temp=obj.nextInt();
//         int ans;
//         ans=((temp*5)/9)+32;
//         System.out.println(ans+" "+"tempreture in fahrenite");

//     }
//     else{
//         System.out.println("invalid");
//     }
//     }


// }
// import java.util.Scanner;
// public class elseif{
//     public static void main(String[] args) {
        
// char ch;
//  Scanner obj=new Scanner(System.in);
// System.out.println("enter any charactor value");
// ch= obj.next().charAt(0);
// if(ch>='a' && ch<='z')
// {
//     System.out.println("lowercase");
// }


// else if(ch>='A' && ch<='Z'){
//     System.out.println("uppercase");
// }
// else{
//     System.out.println("special symbol");
// }
//     }
// }

// import java.util.Scanner;
// public class elseif{
//     public static void main(String[] args) {
        
//         char ch;
//         Scanner obj=new Scanner(System.in);
//         System.out.println("enter any charactor");
//         ch=obj.next().charAt(0);
//         if(ch>='a'&& ch<='z'){
//             ch=(char)(ch-32);
// System.out.println(ch);
//         }
//         else if(ch>='A'&& ch<='Z'){
//                ch=(char)(ch+32);
// System.out.println(ch);
//         }

//         else{
//             System.out.println("special symbol");
//         }
//     }
// }

// import java.util.Scanner;
// public class elseif{
//     public static void main(String[] args) {
        
//         Scanner obj=new Scanner(System.in);
//         int unit;
//         System.out.println(" enter units ");
//         unit=obj.nextInt();
//         if(unit<=100){
//             int bill;
//             bill=unit*5;
//             System.out.println("your bill is +"+bill);
//         }
//         else if(unit>100 && unit<=200){
//             int bill;
//             bill=unit*7;
//             System.out.println("your bill is +"+bill);
//         }
//          else{
//             int bill;
//             bill=unit*10;
//             System.out.println("your bill is +"+bill);
//         }

//     }
    

// }
// import java.util.Scanner;
// public class elseif{
//     public static void main(String[] args) {
        
// //         Library Fine Calculation If book is returned: Within 7 days → no fine.
// // 8–15 days late → ₹2 per day fine. More than 15 days late → ₹5 per day fine.

// int days;
// Scanner obj=new Scanner(System.in);
// System.out.println("enter days of book");
// days=obj .nextInt();
// if(days<=7){
//     System.out.println(" there is no  extra charges");
// }
// else if(days>=8 && days<=15){
//     int fine;
//     fine=(days-7)*2;
//     System.out.println(" extra charges is" +" "+ fine);
//     }

//     else{
//         int fine;
//         fine=(days-7)*5;
//         System.out.println(" extra charges is+"+" "+fine);
//     }
// }}



import java.util.Scanner;
 public  class elseif{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
    int option;
    System.out.println("enter option 1. for f-c & 2. for c-f");
    option= obj .nextInt();
 if(option==1){
        int temp;
        System.out.println("enter tempreture in  fehrenite");
        temp=obj.nextInt();
        int ans;
        ans=(temp-32)*5/9;
        System.out.println(ans+" "+"tempreture in celsius");
if(ans<10){
            System.out.println("collder");
        }
        else if(ans>=10 && ans<20){
              System.out.println("cold");
        }
        else if(ans>=20 && ans<30){
              System.out.println("hot");}}
    else if(option==2){
         int temp;
        System.out.println("enter tempreture in  celsius");
        temp=obj.nextInt();
        int ans;
        ans=((temp*5)/9)+32;
        System.out.println(ans+" "+"tempreture in fahrenite");

        if(ans<10){
            System.out.println("collder");
        }
        else if(ans>=10 && ans<20){
              System.out.println("cold");
        }
        else if(ans>=20 && ans<30){
              System.out.println("hot");
        }}
    else{
        System.out.println("invalid");
    }
 }}