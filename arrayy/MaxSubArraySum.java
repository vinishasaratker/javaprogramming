public class MaxSubArraySum {

    public static void maxsum(int numbers[]) {

        int currentsum = 0;
        int maximumsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = i; k < end; k++) {
                    // subarray sum
                    currentsum = currentsum + numbers[k];

                }
                System.out.println(currentsum);
                if (maximumsum < currentsum) {
                    maximumsum = currentsum;
                }
            }
        }
        System.out.println(maximumsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 6, 9, 7, 4, 3, 2, 7 };
        maxsum(numbers);
    }
}