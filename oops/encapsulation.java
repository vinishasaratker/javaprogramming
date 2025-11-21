// class student{
//     private 
//     String name;
//     int age;
//     int height;
//     public 
//     int getage(){
//                     return this.age;   }
// }
// public class encapsulation {
// // data menbers of dunction s ko ek single entity class me bind krta hai jise encapsulation kehte hai 
// // DATA MEMBERS-- properties ,state 
// //   function--METHOD,behaviour 
// // fully encapsulated class ---- vo  hoti hai jisme all data members  private marked hote hai 
// // mtlb hum only same class me hi access kar skte hai or koi  class access nahi kar skti hai 
// // why encapsulation--*+*  1. information hiding or data hiding (because it is privatelly marked)
// // 2. code reusabitity  3. unit testing  
// public static void main(String[] args) {
//     student obj=new student();
//     System.out.println(" this is called encapsulation jisme method hai or class hai");
//     }
//     }

class human{
    public 
    int height;
    int weight;
    int age ;
    public int getage(){
        return this.age;
    }
    void setweight(int w){
        this.weight=w;
    }
}

class  male extends human{
    String color;
    void sleep(){
        System.out.println("men sleep");
    }

}
class encapsulation{
 // second --Enharitance--koi  class ki property  ko inherit kar lena kisi or class ke ander
// ek main class ya super class hoti h or ek chind class hoti hai 
public static void main(String[] args) {
    male obj1=new male();
    System.out.println(obj1.age);
     System.out.println(obj1.weight);
      System.out.println(obj1.height);
       obj1.sleep();
    
}


}