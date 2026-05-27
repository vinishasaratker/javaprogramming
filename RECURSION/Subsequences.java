public class Subsequences {
    public static void  subseq(String str,int indx,String newString){

        if(indx==str.length()){
System.out.println(newString);
return ;
        }
        // agr charactoe new string m me add hona chahta hai to
        char currentchar=str.charAt(indx);
        subseq(str, indx+1, newString+currentchar);
        // agr new sgtring me add nhi hona chahta hai to 
        subseq(str, indx+1, newString);

    }
    public static void main(String[] args) {
        
        String str="abc";
        subseq(str, 0, "");
    }
}
