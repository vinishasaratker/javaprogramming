import java.util.Scanner;

class RotatedMatrix {

    static int[][] transpose(int matrix[][], int n) {

        int ans[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                ans[i][j] = matrix[j][i];
               ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    static void printmatrix(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    static void reverseArray(int arr[]) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    static void rotatematrix(int matrix[][], int n) {

        int ans[][] = transpose(matrix, n);

        for (int i = 0; i < n; i++) {
            reverseArray(ans[i]);
        }

        printmatrix(ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows & columns:");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        System.out.println("Total no of elements: " + n * n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printmatrix(matrix);

        System.out.println("Rotated Matrix:");
        rotatematrix(matrix, n);
    }
}