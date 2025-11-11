public class pairsum {
    static void ps(int arry[]){
        int n=arry.length;
        int target=7;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arry[i]+arry[j]==target){
 System.out.println( " value is  "+arry[i]+"   "+arry[j]);
 arry[i]=-1;
 }
    }
}
    }
    public static void main(String[] args) {
        int arry[]={1,6,6,3,6,6,};
        ps(arry);
        
    }
}
