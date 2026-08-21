import java.util.Scanner;
class Transpose{

static int[][] transpose(int matrix[][],int c,int r){
int ans[][]= new int [c][r];

for(int i=0;i<c;i++){
    for(int j=i;j<r;j++){

    ans[i][j]=matrix[j][i];
    }

}
return ans ;
}

 static void printMatrix(int [][] matrix){
    for(int i=0 ;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
 }

    public static void main (String[] args){
Scanner sc=new Scanner(System.in);
        System.out.println(" enter no of  rows and columns ");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][] matrix= new int[r][c];
        int totalelements=r*c;
        System.out.println("enter "+ totalelements +" values " );
        for(int i=0;i<r;i++){
            for(int j=0 ;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(" input matrix is :");
        printMatrix(matrix);
        System.out.println(" transpose matrix is :");
       
int [][] ans=transpose(matrix, c, r);
printMatrix(ans);
    }
}