public class TwoPointer {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11, 15 };
        int target = 10;
        boolean found = false;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(left + " " + right);
                found = true;
                break;
            } else if (sum > target) {
                right--;

            } else {
                left++;
            }

        }

        if (found == false) {
            System.out.println("not found ");
        }
    }
}
