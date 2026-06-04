public class Permutation {

    public static void findPermutation(String str, String ans) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

                 // remove current character
                 
            String newstr = str.substring(0, i) + str.substring(i + 1);

            // add curr in answer
            findPermutation(newstr, ans + curr);
        }
    }
    public static void main(String[] args) {

        String str = "abc";

        findPermutation(str, "");
    }
}

    //                           ("abc","")
    //                      /         |         \
    //                    a           b           c
    //                   /            |            \
    //             ("bc","a")   ("ac","b")   ("ab","c")
    //              /      \       /     \       /     \
    //             b        c     a       c     a       b
    //            /          \   /         \   /         \
    //     ("c","ab")  ("b","ac") ("c","ba") ("a","bc") ("b","ca") ("a","cb")
    //         |            |          |           |           |           |
    //         c            b          c           a           b           a
    //         |            |          |           |           |           |
    //   ("","abc")  ("","acb") ("","bac") ("","bca") ("","cab") ("","cba")
    //         |            |          |           |           |           |
    //       PRINT        PRINT      PRINT       PRINT       PRINT       PRINT
    //        abc          acb        bac         bca         cab         cba