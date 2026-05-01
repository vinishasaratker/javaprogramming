
// binary search we only use when we have ascending or descending data 
// we have divide our array into twoparts and we compare with middel one  
//binary search reduces time and  save half time becoz it removes half values 

public class binarysearch {

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 7, 9, 10, 11};
        int key = 9;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return; // stop program
            } 
            else if (arr[mid] > key) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        System.out.println("Not found");
    }
}