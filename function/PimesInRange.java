public class PimesInRange {
    static boolean Checkprime(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void PrimeInRange(int n1) {
        for (int i = 1; i < n1; i++) {
            if (Checkprime(i)) {
                System.out.println(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Checkprime(5);

        PrimeInRange(20);
    }
}
