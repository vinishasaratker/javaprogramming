public class Substring {
   public static void  printsubstr(String str){
    int start=0;
    int end=6;
    String substr="";
    for(int i=start;i<end ;i++){

substr+=str.charAt(i);
    }
    System.out.println(substr);
   }
    public static void main(String[] args) {
        
        String str="hello samar ";
        printsubstr(str);
    }
}

//                            ""
//                     /               \
//                  yes(a)            no(a)
//                  /                    \
//                "a"                     ""
//             /       \               /      \
//         yes(b)     no(b)        yes(b)    no(b)
//          /            \           /          \
//       "ab"            "a"       "b"          ""
//       /   \          /   \      /   \       /   \
//  yes(c) no(c)   yes(c) no(c) yes(c) no(c) yes(c) no(c)
//    /       \       /      \     /      \     /      \
// "abc"    "ab"   "ac"    "a"  "bc"    "b"   "c"     ""

//  PRINT   PRINT   PRINT  PRINT PRINT  PRINT PRINT   PRINT
//   abc      ab      ac     a     bc     b      c      ""