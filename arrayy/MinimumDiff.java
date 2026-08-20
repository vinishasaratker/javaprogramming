public static void MinimumDifference(int arr[]) {

    Arrays.sort(arr);

    int start = 0;
    int end = 1;

    int diff = Integer.MAX_VALUE;

    while (end < arr.length) {

        int currDiff = arr[end] - arr[start];

        if (currDiff < diff) {
            diff = currDiff;
        }

        start++;
        end++;
    }

    System.out.println("Minimum Difference = " + diff);
}