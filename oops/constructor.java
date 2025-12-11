
//     ✅ 1) Static Object Creation (Normal Method)
// 👉 Static object creation ka matlab: object ka naam directly code me likhna।
// constructor is a key word which is automatically calleed at the time of object creation
// constructor has same name as the class name 
// constructor dont have return type


public class constructor{
    public static void main(String[] args) {
        student s1=new student("vinisha");
        System.out.println(s1.name);

        
    }
}
class student{
    String name;
    int age;
    student(String name){
        this.name=name;


    }
}