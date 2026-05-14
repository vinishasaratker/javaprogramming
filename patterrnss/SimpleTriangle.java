public class SimpleTriangle{

     public static void righttriangle(int n){
 for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
    System.out.print("* ");
     }
     System.out.println(); 
     }
        }

        public static void invertedright(int l){
for(int i=0;i<l;i++){
    for(int j=i;j<l;j++){
        System.out.println("  ");
    }
    System.out.println();
    
}
        } 
    public static void main(String[] args) {

       int n=5;
     righttriangle(n);
     int l=7;
     invertedright(l);
 }
}
