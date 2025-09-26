import java.util.Scanner;

class datatype4 {

public static void main(String[] args){
System.out.println("hiii");
// jo byte short int long hota hai vo integer store krte hai short short value ko or long or int higher values ko store krte hai
byte b=1;
short s=78;
int n=90;
long l=889;

char c='c';
float f=90.09f;// jab bhi float me koi value likhte hai to uske bad f lgana must hota hai
double d=865.9655;
boolean status=true;// or boolean ko pura likhna hota hai
System.out.println(b+" "+s+" "+n+" "+l+" "+c+" "+f+" " +d+" "+status+" " );

// **how to take user input 

// **nextInt() → integer input ke liye
// %% nextDouble() → double input ke liye
// ** nextBoolean() → boolean input ke liye
// **next() → single word string ke liye
// ** nextLine() → complete line string ke liye


Scanner datatype4=new Scanner(System.in);
System.out.println("enteer a value");
int a=datatype4.nextInt();
System.out.println(a);



System.out.println("enter your persentage");
double h= datatype4.nextDouble();
System.out.println(h);
//size of any  operator
System.out.println("sizeof double");

System.out.println(Double.SIZE/8);
System.out.println("size of charactor");
System.out.println(Character.BYTES);// here charactor  have 2 bytes due to it follows the unicode pattern


}

}