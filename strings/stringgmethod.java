public class stringgmethod {
    public static void main(String[] args) {
       String name1="vini";
       String name2="saratker";
       /// string ke alg alg charactors ko print krane ka method
       for(int i=0;i<name1.length();i++){
        System.out.println(name1.charAt(i));
       }
// compare of two string
//if string1>string2  : +ve value
//if string1=string2  : 0
//if string1>string2  : -ve value

if(name1.compareTo(name2)==0){
    System.out.println("strings are equal");
}

else{
    System.out.println("strings are  not equal");
}
    }
    
}
