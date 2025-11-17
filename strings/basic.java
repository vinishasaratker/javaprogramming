public class basic {
    public static void main(String[] args) {
    //     String name = "vinisha";
    //     char arr[] = name.toCharArray();
    //     int n = arr.length;
    //     int start = 0;
    //     int end = n - 1;
    //     while (start < end) {
    //         char temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;}
    // String rev = new String(arr);
    //     System.out.println("reverse string is "+rev);

    String name="madam";
    char ar[]=name.toCharArray();
    int start=0;
    int end=ar.length-1;
    boolean pallindrom=true;
    while(start<end){
        if(ar[start]!=ar[end]){
            pallindrom=false;
break;
        }
        start++;
        end--;
    } 
    if(pallindrom){
        System.out.println("palindrom");
    }
    else{
        System.out.println("not pallindrom");
    }

    }
}
