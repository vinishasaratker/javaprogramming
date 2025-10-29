public class funcwithloops {
    static void powerr(int b,int p){
            int ans=1;
        for(int i=1;i<=p;i++){
       ans=ans*b;
     }System.out.println("power is +"+ ans);}
     static void fact(int n){
        int result=1;
       {
for(int i=1;i<=n;i++){
 result=result*i;}
        System.out.println(" factorial is +" +result);} }
        static void isprime(int number){
int count=0;

            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++; } }  
                if(count>2){
                    System.out.println("not prime");}
                 else{
                    System.out.println("prime");
                 }
                 }
                 
        
    public static void main(String[] args) {
        powerr(2,5);
        fact(5);
        isprime(7);   }
}
