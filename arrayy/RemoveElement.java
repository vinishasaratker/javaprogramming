public class RemoveElement {

    static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }


static int sortedArrayRemoveElement(int[] arr) {

    if (arr.length == 0)
        return 0;

    int count = 1;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
            arr[count] = arr[i];
            count++;
        }
    }

    return count;
}


    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);

        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }



int arr[] = {1, 2, 4, 4, 5, 33};

int count = sortedArrayRemoveElement(arr);

System.out.print("Array after removing duplicates: ");
for (int i = 0; i < count; i++) {
    System.out.print(arr[i] + " ");

}
}
}