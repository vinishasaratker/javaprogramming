public class conversionuppercasetolowercase {
    
    public static void main(String[] args) {
        String str1="AbcdE";
        char ch[]=str1.toCharArray();
        for(int i=0;i<str1.length();i++){
            if(ch[i]>='A'&& ch[i]<='Z'){
ch[i]=(char)(ch[i]+32);
            }
            else if(ch[i]>='a'&& ch[i]<='z'){
                ch[i]=(char)(ch[i]-32)    ;        }
        }
            String obj=new String(ch);
            System.out.println(obj);
    }
}
