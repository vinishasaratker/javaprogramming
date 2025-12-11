public class apnaclgcls1 {
        public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
       p1.settip("write properly");
       System.out.println(p1.tip);
       Student s2=new Student();
      s2. average(78,90,65);
      System.out.println(s2.persantage);

      // access modifiers 
      Bank acc=new Bank();

      acc.username="vinisha";// yeh public tha isliye access kar liya gya hai 
      //acc.pass-- isme error aa rha hai kyunki yeh private hai
      acc.Setpass("123vini");// is trh hum passward ko change kar skte  hai  but access nahi kar skte 
    
    }
}
class Pen{
    String color;
    String tip;

     void setcolor(String newcolor){
   color=newcolor;
    }

     void settip(String newtip){
tip=newtip;
    }

}
class Student{
    String name;
    int marks;
    float persantage;
    void average(int phy,int math,int chem){
persantage=(phy+math+chem)/3;
}
}

class Bank{
 public String username;
 private String passward;
 public void Setpass( String pass){
    passward=pass;

 }

}