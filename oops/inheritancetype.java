// class animal{
//     public int weight;
//     public int age;
//     void speak(){
//        System.out.println("speaking");
//     }
    
// }
// class dog extends animal{

// }
// public class inheritancetype {
//     public static void main(String[] args) {
//         // single inheritance ek parent se ek child add hai 
//         dog  obj=new dog();
//        System.out.println(obj.age);
//     }
    
// }
///**** multilever inheritance */
/// A-B-C-D-E
// class animal{

// }

// class dog extends animal{

// }
// class typedog extends dog{

// }
// public class inheritancetype{

//     public static void main(String[] args) {
        
//     }
// }

//*** multiple inheritance   ==== */


// ❌ Java class-to-class multiple inheritance allowed nahi hai

// ✔️ Java interface-based multiple inheritance allow karta hai
 class animal{
    public int age;
    public int weight;
    public void bark(){
        System.out.println("barking -bho-bho-bho");
    }
}   class human{
     public 
     String color;
      public void speak(){
        System.out.println("speaking  -hi-hi-hye");
    }
 }

 class hybrid extends human,animal{

 }
class inheritancetype{
public static void main(String[] args) {
    // jab ek class ko do classes inherit kar rhi hai 
}
}