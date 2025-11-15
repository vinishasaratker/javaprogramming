public class dup
 {      static void twodup(int arr5[]){
            for(int i=0;i<arr5.length;i++){
                boolean dup=false;
                int count=1;
                for(int j=i+1;j<arr5.length;j++){
                    if(arr5[i]==arr5[j] && arr5[i]!=-1){
                        ++count;
                        arr5[j]=-1;
                        dup=true;}
                }
               if(arr5[i]!=-1 && count > 1){
          System.out.println(arr5[i] + " is duplicated " + count + " times");
      }   else if(arr5[i]!=-1 && count == 1){
                      System.out.println(arr5[i] + " occurs only once");
}  }   }
        public static void main(String[] args) {

        int arr5[]={1,-1,3,4,3,-1,2,5,-1,7,6};
        twodup(arr5);
        
    }
}
