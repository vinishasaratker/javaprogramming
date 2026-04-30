public class largest {
    public static void main(String[] args) {
        
    
    int largest =-1;
    int arry[]={2,5,6,3,99,90,33};
    for(int i=0;i<arry.length;i++){
        if(arry[i]>largest){
            largest=arry[i];
        }
    }
    System.out.println(largest);
}
}