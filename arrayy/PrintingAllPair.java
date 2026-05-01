public class PrintingAllPair {
    public static void main(String[] args) {
       int arry[]={2,3,4,5,6,1,9};
       for(int i=0;i<arry.length;i++){
        int num=arry[i];
        for(int j=i+1;j<arry.length;j++){
            System.out.println("("+num+ " ,"+ arry[j]+ ")" );
        }
        System.out.println();
        
       }  }
}
