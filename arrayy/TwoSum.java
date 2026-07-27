public class TwoSum {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
        int target = 10;
        int leftp = 0;
        boolean status = false;

        int rightp = arr.length - 1;
        while (leftp <= rightp) {
            int sum = arr[leftp] + arr[rightp];
            if (sum == target) {
                System.out.println(leftp + " ==" + rightp);
                status = true;
                break;
            }
             else if (sum > target) {
                rightp--;

            } else {

                leftp--;
            }
        }
        if (status = false) {
            System.out.println("not found ..");
        }
    }
}
