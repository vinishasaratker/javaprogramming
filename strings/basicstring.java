public class basicstring {
    static void pallin(){
        String name="nooion";
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(0)==name.charAt(n-i-1)){
                System.out.println("pallindrom");

            }
            else{
                System.out.println(" not pallindrom");
            }
        }

    }
    static void substring(String str,int startindex,int endindex)
{ String substr=" ";

int n=str.length();
for(int i=startindex;i<endindex;i++){
    substr+=str.charAt(i);
    

} System.out.println(substr+" "+ " sub string value is :");
    }

    static void largeststring(){
        String fruits[]={"mango","apple","pineapple"};
        int n=fruits.length;
         String largest=fruits[0];
        for(int i=0;i<n;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i]; }
             }
       System.out.println(largest);
    }
    
    public static void main(String[] args) {
        
        char arr2[]={'a','b','c','d'};
        String str1="vinisha";
        String str2=new String(" vinishaa ");
        String fullname=str1+" "+str2;
        System.out.println(fullname);
        System.out.println(fullname.charAt(7));

pallin();
substring("hyy this is wini",1,7);
largeststring();
    }
}
