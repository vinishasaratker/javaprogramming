public class Prinnumbertostring {
// array for digit words 

 public static void print(int num){

 String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};


// base case 
if(num==0){
     return ;
    }
    // gettting last digit 
   int lastdigit=num%10;
   // recursive calll for all other numbers
   print(num/10);
   // printing
   System.out.println(words[lastdigit]+" ");

 }
    public static void main(String[] args) {
        
        int num=1947;
        if(num==0){
            System.out.println("zero");
        }
        else{
            print(num);
        }
    }
}
