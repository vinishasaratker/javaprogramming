package ARRY2D;

public class DiagonalSum {

    static void dsum(int matrix[][]) {

        int sum = 0;
/// is code me time complexity (O n^2)  hai  so we writw a optimize code 
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                // primary diagonal
                if (i == j) {
                    sum = sum + matrix[i][j];
                }

                // secondary diagonal
                // jha pr bhi i+j  ka sum n-1 ke  equal ata hai  vha pr secondary diagonal exist krta hai  
                //   i+j=n-1
                //
                else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.println("Diagonal Sum = " + sum);

    }


static void dsum2(int matrix[][]){
  int sum=0;
    for(int i=0;i<matrix.length;i++){
      
        //primary diagonal  sum 
        sum+=matrix[i][i];
        // secondary diagonal
        // i+j=n-1
        //j=n-1-i
        if(i!=matrix.length-1-i)
sum+= matrix[i][matrix.length-i-1];

    }
System.out.println(sum);
}


    public static void main(String[] args) {

        int matrix[][] = {
                {2, 4, 5, 6},
                {4, 7, 8, 9},
                {0, 3, 2, 5},
                {7, 5, 4, 3}
        };

        dsum(matrix);
        dsum2(matrix);
    }
}