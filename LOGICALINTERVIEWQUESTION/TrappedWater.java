package LOGICALINTERVIEWQUESTION;

public class TrappedWater {

    public static int trappedrailwater(int height[]) {

        int n = height.length;
        // firstly left most maximum boundary nikalni hai -array

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // similarly calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i++) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {

            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {

        int height[] = {};
        System.out.println(trappedrailwater(height));
    }
}
