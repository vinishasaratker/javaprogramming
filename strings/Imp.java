import java.sql.Array;
import java.util.*;
public class Imp {

static  void strcompression( String str3){
StringBuilder newstr=new StringBuilder(); 
    for(int i=0;i<str3.length()-1;i++){


      Integer count=1;
        while( i<str3.length()-1  && str3.charAt(i)==(str3.charAt(i+1))){
count++;
i++;

        }
        newstr.append(str3.charAt(i));
        if(count>1){
            newstr.append(count);

        }

    }
    System.out.println("----------");
System.out.println(newstr);
}

static void removedup(String mmm){
HashSet hs=new HashSet();

    StringBuilder newstr=new StringBuilder();
    for(int i=0 ;i<mmm.length();i++){
        char ch= mmm.charAt(i);
       if(!hs.contains(ch)){
        hs.add(ch);
        newstr.append(ch);
       }

        }
System.out.println(newstr);
}


 static void longeststring(String srname){

String words[]=srname.split("");
 String longest="";
for(int i=0;i<srname.length();i++){
   
    for(String word:words){
        if(word.length()>longest.length()){
            longest=word;
        }
    }
    System.out.println(longest);
}

 }


    
static  boolean IsPalindrome(String num1,String num2){

boolean Status = false ;
for(int i=0 ; i< num1.length();i++){
        for(int j=num2.length()-1;j>=0;j--){
if(num1.charAt(i)==num2.charAt(j)){
    Status=true ;
}

  }

    }
    System.out.println("'cheching palindrome  ");
return Status ;

}


static void  IsAnagram( String  qu1,String qu2){
boolean status=false ;

qu1=qu1.toLowerCase();
qu2=qu2.toLowerCase();
 qu2=qu2.trim();
 qu1=qu1.trim();

 char [] words=qu1.toCharArray();
  char[] words2=qu2.toCharArray();;

  Arrays.sort(words);
  Arrays.sort(words2);

if(Arrays.equals(words, words2)){
    System.out.println(" anagram ");
}
else{
    System.out.println(" not anagram ");
}
if(qu1.length()!=qu2.length()){
    System.out.println("not  anagram  ");
}
}


static void NonRepeating(String vini) {
boolean  found = false ;
    for (int i = 0; i < vini.length(); i++) {

        char ch = vini.charAt(i);

        if (vini.indexOf(ch) == vini.lastIndexOf(ch)) {
            System.out.print("  :"+ch+" ");
            found=true;
            continue ;
        }
    }
    if(!found){
System.out.println(" no uniqye character ");
    }
}




static void que2(String name) {
    String[] words = name.split(" ");

    for (String word : words) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.print(" ");
    }
}
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
String name=" java is programming language ";
que2(name);
 String num1="listen" ;
 String num2="netsil";
  System.out.println(IsPalindrome(num1,num2));
  String qu1="listen";
  String qu2="SILENT";
 IsAnagram(qu1, qu2);
String vini="vinishaa";
 NonRepeating(vini);
 String str3="aabbbcc";
 strcompression(str3);
 String mmm="pproogramming";
 removedup(mmm);

   String srname=" java is programming gusy  oohehejijija aj";
   longeststring(srname);
    }
}
