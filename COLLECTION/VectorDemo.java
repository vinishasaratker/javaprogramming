import java.util.Vector;
import java.util.Iterator;
public class VectorDemo {
    public static void main(String[] args) {

        // Generic type use kiya (Object) kyunki mixed data store karna hai
        Vector<Object> v = new Vector<>();

        // 1️. Add Integers 0–9
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }

        // 2. Add Characters A–Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            v.add(ch);
        }

        // 3️. Add alternating true/false
        boolean b = false;
        for (int i = 0; i < 10; i++) {
            v.add(b);
            b = !b;   // toggle value
        }

        System.out.println("Before removing false:");
        System.out.println(v);

        // 4️. Remove only false Boolean values
        Iterator<Object> itr = v.iterator();

        while (itr.hasNext()) {
            Object obj = itr.next();

            if (obj instanceof Boolean) {
                Boolean value = (Boolean) obj;

                if (!value) {
                    itr.remove();   // safe remove
                }
            }
        }
        System.out.println("After removing false:");
        System.out.println(v);
    }
}