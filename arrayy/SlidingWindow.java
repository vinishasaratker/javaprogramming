public class SlidingWindow {
    public static void main(String[] args) {
        int[] user = { 100, 48, 82, 57, 34, 112, 65 };
        int days = 3;
        int windowSum = 0;
        int average = 0;
        for (int i = 0; i < days; i++) {
            windowSum = windowSum + user[i];
            average = windowSum / days;
            System.out.println("total no. of users visited ==" + average);
            for (int j = 1; j <= user.length - days; j++) {
                windowSum = windowSum - user[j - 1] + user[i + days - 1];
                average = windowSum / days;

            }
            System.out.println("average is =>" + average);
        }
    }
}
