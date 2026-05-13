package ARRY2D.DPPQUE;

public class sumofsecondrow {
    public  static  void sum(int nums[][] ){
int sum=0;
int row=1;
int startcol=0;
int endcol=nums[0].length-1;
while(row==1 && startcol<=endcol){
    sum=sum+nums[row][startcol];
startcol++;
}
System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums [][]={{1,4,9},{11,4,3},{2,2,3}};
    
    sum(nums);}
}
