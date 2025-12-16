public class missingnumber {
    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 19};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int num = arr[i] + 1; num < arr[i + 1]; num++) {
                System.out.println(num);
            }
        }
    }
}

