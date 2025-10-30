public class funcwithloops {
// power caalculation
    static void powerr(int b,int p){
            int ans=1;
        for(int i=1;i<=p;i++){
       ans=ans*b;
     }System.out.println("power is +"+ ans);}
// factorial 
     static void fact(int n){
        int result=1;
       {
for(int i=1;i<=n;i++){
 result=result*i;}
        System.out.println(" factorial is +" +result);} }
// prime number or not 
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
                 // sum of n*n+1 natural numbers
             static void  sumof(int num){
                int sum=0;
                for(int i=1;i<=num;i++){
                    sum=sum+i; }
int ans=sum*(num+1);
System.out.println(" sum of n*n+1 natural numbe is +" +ans);
             }
             static void factorsum(int m){
                int add=0;
                for(int i=1;i<=m;i++){
                if(m%i==0){
                    add= add+i; } }
                    System.out.println(" summetion of factor is +"+add);
             }  
// largrest of three digit number
             static void largestofthreedigit(int number1){
                int largest=0;
                while(number1>0){
                    int digit=number1%10;
                    if(digit>largest){
                        largest=digit;
                    }
                    number1=number1/10;
                }
                System.out.println("largest digit of a three digit number is "+largest);
             }
             // perfect number or not 
             static void perfect(int q){
                int temp;
                temp=q;
                int sum=0;
                for(int i=1;i<q;i++){
                    if(q%i==0){
                        sum=sum+i;} }
                if(temp==sum){
                    System.out.println(" the numberis perfect");}
                else{
                    System.out.println(" not perfect"); }
             }
// armstrong number or not
             static void armstrong( int r){
                int arm=0;
                int temp1;
                temp1=r;
                while(r>0){
                    int ld=r%10;
arm=arm+ld*ld*ld;
                    r=r/10;
                }
                if(arm==temp1){
                    System.out.println(" armstrong");
                }
                else{
                    System.out.println(" not armstrong");
                }

             }
// febonachhi
             static void febonacchi(int n){
                int ft=0;
                int st=1;
                int nextterm=0;
                n=0;
                while(n<7){
                    if(n==0){
                        System.out.println(ft);
                        ++n; // humne pehle n==0  ko badha diya hai turant hi to jvm ki vjh se iteration khatam ho jayengi or next par jayengi bhi nahi 
                        continue;// agr humne continue ka use kiya hai to hum is vali iteration se jump kar rhe hai so it is a better way
                    }
                    else if(n==1){
                        System.out.println(st);
                        ++n;
                        continue;
                    }
                    nextterm=ft+st;
                    ft=st;
                    st=nextterm;
                    System.out.println(nextterm);
                    ++n;
                }
             }
             static void palindrom(int z){
                int t;
                t=z;
                int reverse=0;
                int lastnumber=0;
while(z>0){
    lastnumber=z%10;
    reverse=reverse*10+lastnumber;
    z=z/10;
}
if(reverse==t){
    System.out.println("palindrm");
}
 else{
    System.out.println(" not a palindrom");
 }            }
             public static void main(String[] args) {
        powerr(2,5);
        fact(5);
        isprime(7); 
    sumof(5);  
factorsum(9);
largestofthreedigit(897);
perfect(12);
armstrong(153);
febonacchi(7);
palindrom(171);

}
}
