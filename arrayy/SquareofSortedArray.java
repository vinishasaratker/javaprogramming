import java.util.Arrays;
public class SquareofSortedArray {
 public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
public static void main(String[] args) {
    int nums[]={2,2,3,4,5};
   
SquareofSortedArray obj = new SquareofSortedArray();
System.out.println(Arrays.toString(obj.sortedSquares(nums)));
}
}
    
