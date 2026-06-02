 package Backtracking;
 
 public class NqueneProblem {
 
    
    public static void Nqueens(char board[][],int row){
        // base case 
        if(row==board.length){
           printboard(board);
            return ;
        }
        // column loop 
          for(int j=0;j<board.length;j++){
            // pehle n queens ko bitha diya hai 
            board[row][j]='Q';
            // then  function call kr diya hai  
            Nqueens(board, row+1);
            // or fir backtracking ke  bad jab vo dubara se ayengi to us queen ko uske place se utha diya hai 
            board[row][j]='X';        }
    }
    public static void  printboard(char board[][]){
        System.out.println(" ------------- chess board -------------");
for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
    }
    System.out.println();
}
    }
 public static void main(String[] args) {
    int n=2;
    char board[][]=new char[n][n];
    //initializaton 
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]= 'X';
        }
    }
    Nqueens(board, 0);

 }

}