public class copyconstructor {
    public static void main(String[] args) {
        student s1=new student("mohini",78);
        s1.passward="abcdef";
        s1.age=67;
        System.out.println(" changed : "+ s1.age);
       
        student s2=new student(s1);
        s2.passward="xyss";
        System.out.println("copy constructor is called :");
        System.out.println(s2.passward);
        // yha references copy ho rhe hai  or s1 me change krne se  s2 bhi change ho rha hai 
        System.out.println(" copy constructor age is "+s2.age);
    }
}

class student{

        String name;
        int age;
        String passward;

student(student s1){
this.name=s1.name;
this.age= s1.age;
this.passward=s1.passward;
}
 student( String name,int age){
    
            this.name=name;
            this.age=age; }
    
}