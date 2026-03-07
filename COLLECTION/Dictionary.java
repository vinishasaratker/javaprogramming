import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Dictionary{
    public static void main(String[] args) {
          Dictionary<Integer,Integer> h= new Hashtable<Integer,Integer>();
h.put(1,1000);

h.put(2,3000);
h.put(3,4000);
h.put(4,5000);
h.put(5,3000);
System.out.println(" "+h);
System.out.println("print data   of dictionary using emuration ");
Enumeration<Integer> e=h.keys();
while(e.hasMoreElements()){
    Integer k=e.nextElement();
    System.out.println("key is : "+k+" "+ " value is :"+h.get(k));
}
Map<Integer,Integer> h1=new Hashtable<Integer,Integer>();
h1.put(3,78);
h1.put(67,88);
System.out.println("primt map data using inner interface ");
for(Map.Entry<Integer,Integer>+x:h1.entrySet()){
    System.out.println("key is :"+x.getkey()+" value is "+);
}
    }
}