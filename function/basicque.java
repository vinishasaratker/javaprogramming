public class basicque {
static void largest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is greatest: " + b);
        } else {
            System.out.println("c is greatest: " + c);
        }
    }

static void sum(int c,int d){
    System.out.println(" sum is +"  +c+d);
}

static void mul(int e,int f){
    System.out.println(" multiplication is+"+ "  "+ e*f);
}

static void iseven(int n){
    if(n%2==0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
}
static void largestofthreedigits(int n1){
    if(n1>99 && n1<1000){
        int ld=n1%10;
        n1=n1/10;
        int ld2=n1%10;
        n1=n1/10;
        int ld3=n1%10;
        n1=n1/10;
        if(ld>ld2 && ld>ld3){
            System.out.println(" last digit  first is greater +"+ld);
        }
  else if(ld2>ld && ld2>ld3){
            System.out.println(" last digit second is greater +"+ld2);
        }
         else if  (ld3>ld2 && ld3>ld){
            System.out.println(" last digit third is greater +"+ld3);}
    }}
    public static void main(String[] args) {
        largest(4, 7, 8);  // just call the method, don’t print it
        sum(6,9);
        mul(6,9);
        iseven(90);
        largestofthreedigits(890);
    }
}
