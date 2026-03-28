import java.util.Scanner;
public class basicfunc {
    static void add() {
     // here we didnt return any thing so that  we have use void
        System.out.println(56 + 98);
       }
        String names(){
        return "returnn "; 
    }
        
       boolean add2(){
        return true;
        }
        public static void main(String[] args) {
        basicfunc obj=new basicfunc();
  
        obj.add();
        System.out.println(obj.names());
           System.out.println(obj.add2());
      }

        }