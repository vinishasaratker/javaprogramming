public class printingpatterns{

static void pp( int n){
    for(int  r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
            if(c>=r){
                System.out.print("*");
            }
        
        else{
            System.out.print(" ");
        }
    }
    System.out.println();}
    }
    static void right( int n){
    for(int  r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
            if(c>=r){
                System.out.print("");
            }
        
        else{
            System.out.print("*");
        }
    }
    System.out.println();
    }


}


    public static void main(String[] args) {
       pp(5);   
       right(6);
      
    
   
}
}