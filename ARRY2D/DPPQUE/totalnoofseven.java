package ARRY2D.DPPQUE;

public class totalnoofseven {
   public static void printseven(int matrix[][],int number){
    int count =0;
for(int row=0;row<=matrix.length-1;row++){
  
    for(int col=0;col<=matrix[0].length-1;col++){
        if(matrix[row][col]==number){
        count =   count+1;
           
        }
       
    }}
     System.out.println( "  "+" number is : "+ number + " "+ "  "+ count );

   } 
    public static void main(String[] args) {
      int matrix[][]={
        {4,7,8},{8,8,7}
      }  ;
      int number=7;
      printseven(matrix , number);
    }
}
