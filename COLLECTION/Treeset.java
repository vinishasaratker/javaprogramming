import java.util.TreeSet;
import java.util.Iterator;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> h=new TreeSet<String>();

      h.add(100);
      h.add(10);
      h.add(90);  

         h.add(new String("a"));

         h.add(new String("z"));

         h.add(new String("b"));
        
         h.add(new String("uu"));
         System.out.println(""+h);

           System.out.println("try to add duplicate : "+  h.add('u'));

       System.out.println("all elements of Set : "+h);

       System.out.println("Print Element using for each :");

       for(int x:h){
           System.out.print("==>"+x);
       }

       System.out.println("");

       Iterator<Integer> itr=h.iterator();

       while(itr.hasNext())
       {

           int y=itr.next();

           System.out.print("------>"+y);

       }

        System.out.println("");
       

    }
}
