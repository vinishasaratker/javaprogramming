public class abstraction {
    public static void main(String[] args) {
        horse h=new horse();
        h.walk();
        h.eat();
        chiken ch=new chiken();
        ch.walk();
        ch.eat();
        System.out.println(ch.color);
        System.out.println(ch.color);

    }
}
// abstract classes ke object create nahi kar skte agr abstract class ke object bnayenge to error aa jayenga 
  abstract class animal{
// abstract class  ke objects nahi hai but constructor hote hai 
String color;
int age;

animal(){
color="brown";
}


    void eat(){
        System.out.println(" both can eat");
    }
abstract void walk();// ise implement nahi krna hai only idea diya hai 
}
class horse extends animal{
    void walk(){
        System.out.println(" walk by 4 legs ");
    }

}
class chiken extends animal{
 void walk(){
    System.out.println(" walk by 2 legs");
    color="pink";
 }
}