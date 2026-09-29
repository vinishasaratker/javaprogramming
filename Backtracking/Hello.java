import java.util.*;
class Hello{

    public static void main (String[]args){
      ArrayList<Integer> list=  new ArrayList<>();
      list.add(8);
      list.add(87);
      System.out.println(list);
      int ans=0;
      int n=10;
      for(int i=0;i<n;i++){
        ans=ans+i;

      }
       System.out.println(ans);
    }
}