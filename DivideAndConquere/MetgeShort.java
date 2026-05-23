package DivideAndConquere;

public class MetgeShort {

    // print array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeshort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int mid = (si + ei) / 2;

        // left side
        mergeshort(arr, si, mid);

        // right part short
        mergeshort(arr, mid + 1, ei);

        // merge both sorted parts
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // left (0-3) right (4-6)
        // so size = (6-0+1)=7

        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        // compare left and right elements
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // left part ke kuch bache elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part ke bache huye element
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp array elements to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3, 6, 88, 4, 2, 8, 0 };

        // pass actual array not null
        mergeshort(arr, 0, arr.length - 1);

        printarr(arr);
    }
}