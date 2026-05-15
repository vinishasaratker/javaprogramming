class BasicRecursion {

    // recursion me ek base case jrur hona chahiye nhi to stack overflow ki
    // condition aa jati hai
    public static void printdecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printdecreasing(n - 1);

    }

    public static void printincrasing(int m) {

        if (m == 1) {
            System.out.print(1 + " ");
            return;
        }

        printincrasing(m - 1);
        System.out.print(m + " ");
    }

     

    public static void main(String[] args) {
        int n = 10;
        printdecreasing(n);
        int m = 40;
        printincrasing(m);
       
    }
}
