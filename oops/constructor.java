
//     ✅ 1) Static Object Creation (Normal Method)
// 👉 Static object creation ka matlab: object ka naam directly code me likhna।
// constructor is a key word which is automatically calleed at the time of object creation
// constructor has same name as the class name 
// constructor dont have return type


public class constructor{
    public static void main(String[] args) {
        student s1=new student("vinisha");
        System.out.println(s1.name);
        student s2=new student(78);
        System.out.println(s2.age);
 }
}
class student{
    String name;
    int age;
    student(String name){
        // parameterised constructor 
        this.name=name;

System.out.println("constructor is called");
    }
    student(int age){
        this.age=age;
        System.out.println("parameterised constructor is called");
    }
}