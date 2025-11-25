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
// // data members of function s ko ek single entity class me bind krta hai jise encapsulation kehte hai 
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
    public void  setage(int a){
        this.age=a;
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

// agr koi super class me property public  hai to hum usko publicaly subclasses me inheritkar skte hai 
//agr super class me private hai or subclass me access lar rhe hai to not accessabble honga 
// access modifier property               . mode of inheritance
// public      public      ==public
//public       private      ==== private  
// public       protected      == protected
// protected     public        === protected
//  protected      protected   ====protected
//protecred       private      ==private 
// protectecd == apni class me access kar skte hai bahr access nahi kar skte hai but child
// class access kar skti hai 
public static void main(String[] args) {
    male obj1=new male();
    obj1.setage(20);
    System.out.println("age is"+obj1.age);
    obj1.setweight(54);
     System.out.println("weight is"+obj1.weight);
      System.out.println(obj1.height);
       obj1.sleep();
    
}


}