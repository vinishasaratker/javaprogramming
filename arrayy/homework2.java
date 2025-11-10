public class homework2 {
    static void duplicate(int arr4[]){
        int ans=0;
        // aGR EK HI DUPLICATE TERM PRESENT HO ARRAY ME TAB HI YEH LOGIC KAAM KRENGA OTHERWISE IT WILL PROVIDES WRONG ANSWER
        for(int i=0;i<arr4.length;i++ ){
             ans=ans^arr4[i];
        }
        for(int i=1;i<arr4.length;i++){
            ans=ans^arr4[i];}
        System.out.println("  1 duplicate is "+ans);    }

        static void twodup(int arr5[]){
            for(int i=0;i<arr5.length;i++){
                boolean dup=false;
                int count=1;
                for(int j=i+1;j<arr5.length;j++){
                    if(arr5[i]==arr5[j] && arr5[i]!=-1){
                        ++count;
                        arr5[j]=-1;
                        dup=true;}
                }
                if(arr5[i]!=-1){
                    System.out.println(arr5[i]+" counts "+count);
                }
            }

        }
    
        public static void main(String[] args) {
int arr4[]={2,6,7,8,1,3,3,2};
        duplicate(arr4);
        int arr5[]={1,1,3,4,3,2,2,5,6,7,6};
        twodup(arr5);
    }
}
