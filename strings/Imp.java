public class Imp {
    

       static  void QueOne(String str){
        int vovel=0 ;
        int consonant=0;
        int number=0;
        int specialsymbol=0;
        int spaces=0;
 for(int i=0 ;i<str.length();i++){
    char ch=Character.toLowerCase(str.charAt(i));
   
    if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
        vovel ++;
       
    }
    else if(ch>'a' && ch<'z'){
        consonant++;
     

    }
    else if(ch=='0'||ch=='9'){
number++;

    }

    else if(ch== ' '){
        spaces++;

    }
    else{
        specialsymbol++;
      
    }




 }
   System.out.println(consonant);
  System.out.println("vovel is"+ vovel);
    System.out.println(specialsymbol);
    System.out.println(number);
    System.out.println(spaces);

       }
    public static void main (String[]args){
String str="Java@123 Programming";
QueOne(str);
String str2=" java is programming language ";

    }
}
