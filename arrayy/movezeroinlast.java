public class movezeroinlast
 {      static void twodup(int arr5[]){
   int fc=1;
            for(int i=0;i<arr5.length;i++){
                boolean dup=false;
                int count=1;
                for(int j=i+1;j<arr5.length;j++){
                    if(arr5[i]==arr5[j] && arr5[i]!=-1){
                        ++count;
                        arr5[j]=-1;
                        dup=true;
                    }
                }
               if(arr5[i]!=-1 && count > 1){
          System.out.println(arr5[i] + " is duplicated " + count + " times");
      }   else if(arr5[i]!=-1 && count == 1){
                      System.out.println(arr5[i] +" frequency count is :" + " occurs only once");
                      fc++;
}  }   }
        public static void main(String[] args) {

        int arr5[]={1,2,3,4,3,1,2,5,4,7,6};
        twodup(arr5);
    }
}