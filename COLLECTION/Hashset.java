import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
      public static void main(String[] args) {
       HashSet<Integer> h=new HashSet<Integer>();
       h.add(100);
       h.add(10);
       h.add(90);
       h.add(80);
       h.add(30);
       h.add(70);
       h.add(40);
       h.add(60);
       h.add(50);
     System.out.println("try to add duplicate  "+  h.add(10));
     System.out.println("all elements of Set : "+h);
     System.out.println("Print Element using for each ");
        for(int x:h){
            System.out.print("==>"+x);
        }

        System.out.println("");
        Iterator<Integer> itr=h.iterator();
        
        while(itr.hasNext()){
            int y=itr.next();
            System.out.print("------>"+y);
        }
         System.out.println("");
       

    }
}
