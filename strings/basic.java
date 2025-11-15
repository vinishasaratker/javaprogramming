public class basic {
    public static void main(String[] args) {
        String name = "vinisha";
        char arr[] = name.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String rev = new String(arr);
        System.out.println("reverse string is "+rev);
    }
}
