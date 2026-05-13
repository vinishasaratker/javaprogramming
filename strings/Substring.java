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
