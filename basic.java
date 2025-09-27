class basic{
    public static void main(String[] args) {
        
    //    binary-- it performs multiple operands 
    //    arithmetic +  -  *  /
    //    assignment operator +=  -= *=  /= %=
    //    relational operator >  <  >=  <=  == !=
    //    logical operator  and && or || not 
    //    bitwise = and or not xor

    // x-or---ya to different value ya to same value nikalna  hota hai
 int a=78;// decleration
 int b=12;//initialization
// system ek class hai orr only class hi capital ho skta hai  or jo out hai vo object hai println ka 
// java  platform independent hai kyunki byte code me convert krta hai java
// sari system ki functionality system class ke andr honi chahiye isliye system ke andr out hota hai

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

//assignmentnt operator  do not repeat your self dry principal ko follow krta hai
    // priority of equal(=) operator is very less
    a+=b;
    System.out.println(a);
    a*=b;
     System.out.println(a);


     // relational--shows relation between two things 
System.out.println(a>b);
System.out.println(a<b);//upper bounded language hone ke karan  true or false ho rha hai
System.out.println(a<=b);



boolean c=true;
boolean d=true;
System.out.println(c&&d);
//System.out.println(a || b );
// bitwisw operators
int r=2;
int s=3;
System.out.println(r&s);
System.out.println(r|s);
  // x-or it produces output  true when both the input are different (^)

  // ternary operator----
  int num=9;
  System.out.println((num%2==0)? "even":"odd");
// else if
int number=90;
if(90%2==0){
  System.out.println("even");
}    
else{
  System.out.println("odd");
}
// positive negative or zero
int m=89;
if(m>0){
  System.out.println("positive");
}
else if(m<0){
  System.out.println("negative");
}
else{
  System.out.println("zerooo");
}

}
}