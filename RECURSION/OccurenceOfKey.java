public class OccurenceOfKey {
    public static int firstoccurence(int arr[],int key,int i){

        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
public static int tilingproblrm(int n){
if(n==1 || n==0){
    return 1 ;
}

    int fm1=tilingproblrm(n-1);
    int fm2=tilingproblrm(n-2);
    int total=fm1+fm2;
    return total ;
}

public static void duplicateInstring(String str ,int index,boolean map[],StringBuilder newstr){

    if(index==str.length()){
        System.out.println( newstr);
        return ;
    }
    char currentchar=str.charAt(index);

    if(map[currentchar-'a']==true){
duplicateInstring(str, index+1, map, newstr);
    }
    else{
        map[currentchar-'a']=true;
        duplicateInstring(str, index+1, map, newstr.append(currentchar));
    }
}


public static int friendsPairing(int n){

    // base case 
    if(n==1 || n==2){
        return n;
    }
    // single paring 
    int fm1=friendsPairing(n-1);
    // double 
    int fm2=friendsPairing(n-2);

    int pairways=(n-1)*(n-2);
    // total  ways 
    int totalways=fm1+pairways;
    return totalways; 
    /// alternate way
      // return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
}


public static void printBinaryString(int n,int lastplace,String str){

    // base 
    if(n==0){
       System.out.println(str);
       return ;
    }
    // kaam 
    if(lastplace==0){
        printBinaryString(n-1, 0, "0");
        printBinaryString(n-1, 1, "1");
    }

    else{
        printBinaryString(n-1, 0, "0");
    }
}
  public static void main(String[] args) {
         int arr[]={2,4,5,6,7,5,99,9,0};
         System.out.println(firstoccurence(arr, 5, 0));
          System.out.println(tilingproblrm(4));
String str="vviinuishaa";
          duplicateInstring(str,0, new boolean[26], new StringBuilder(""));
   System.out.println(friendsPairing(3));
   
   printBinaryString(3, 0, "");
        }
}
