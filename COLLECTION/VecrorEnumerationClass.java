import java.util.Enumeration;
import java.util.Vector;
public class VecrorEnumerationClass {
    public static void main(String[] args) {

        Vector<String> v2 = new Vector<String>();
        v2.add("vini");
        v2.add("moyi");
        v2.add("yt");

        Enumeration<String> en = v2.elements();
        //elements() is a method of vector class yeh enumeration ke elements ko one by one read krta hai 
         while(en.hasMoreElements()) {
            String x = en.nextElement();
            System.out.println("====> " + x);
        }
    }
}