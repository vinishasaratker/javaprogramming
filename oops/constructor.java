class hero{
    hero(){
        System.out.println("hello constructor is called ");
 }

}
public class constructor {

//     ✅ 1) Static Object Creation (Normal Method)
// 👉 Static object creation ka matlab: object ka naam directly code me likhna।
    public static void main(String[] args) {
        // object create statically
        System.out.println("staticallly called");
        hero ramesh=new hero();
      // dynamically

      System.out.println(" dynamically called");
      new hero();

    }
}
