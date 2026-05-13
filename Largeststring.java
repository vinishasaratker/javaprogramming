public class Largeststring {

    static void largest(String fruits[]) {
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            // String largest=fruits[0];
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
                // because compareTo return integer value agr condition true hai to positive me
                // or false hai to negative me or eqal h to zero
            }

        }
        System.out.println(largest);
    }
///---------------------------------------
//     public static String strcompression(String str) {

//         String newstr = "";

//         for (int i = 0; i < str.length(); i++) {

//             Integer count = 1;

//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }

//             newstr += str.charAt(i);

//             if (count > 1) {
//                 newstr += count.toString();
//             }
//         }

//         return newstr;
//     }
// ////------------------------------------------
public static String strcompression(String str) {

    StringBuilder newstr = new StringBuilder();

    for(int i = 0; i < str.length(); i++) {

        int count = 1;

        while(i < str.length()-1 &&
              str.charAt(i) == str.charAt(i+1)) {

            count++;
            i++;
        }

        newstr.append(str.charAt(i));

        if(count > 1) {
            newstr.append(count);
        }
    }

    return newstr.toString();
}
//////-----------------------
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango0", "banana" };
        largest(fruits);

        String str = "bbbbnnkk";
        System.out.println(strcompression(str));

    }
}
