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
    System.out.println(" sum is +"+c+d);
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
    public static void main(String[] args) {
        largest(4, 7, 8);  // just call the method, don’t print it
        sum(6,9);
        mul(6,9);
        iseven(90);
    }
}
