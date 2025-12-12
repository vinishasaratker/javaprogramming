public class abstraction {
    public static void main(String[] args) {
        horse h=new horse();
        h.walk();
        h.eat();
        chiken ch=new chiken();
        ch.walk();
        ch.eat();

    }
}

  abstract class animal{
    void eat(){
        System.out.println(" both can eat");
    }
abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println(" walk by 4 legs ");
    }

}
class chiken extends animal{
 void walk(){
    System.out.println(" walk by 2 legs");
 }
}